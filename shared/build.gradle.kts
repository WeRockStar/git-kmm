import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin(KotlinPlugins.multiplatform)
    kotlin(KotlinPlugins.serialization) version Kotlin.version
    id("com.android.library")
}

version = "1.0"

kotlin {
    android()

    val iosTarget: (String, KotlinNativeTarget.() -> Unit) -> KotlinNativeTarget = when {
        System.getenv("SDK_NAME")?.startsWith("iphoneos") == true -> ::iosArm64
        System.getenv("NATIVE_ARCH")?.startsWith("arm") == true -> ::iosSimulatorArm64
        else -> ::iosX64
    }

    iosTarget("ios") {
        binaries {
            framework {
                baseName = "shared"
            }
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(Ktor.core)
                implementation(Ktor.serialization)
                implementation(Ktor.logging)
                implementation(Ktor.contentNegotiation)
                implementation(Logging.napier)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin(Testing.common))
                implementation(kotlin(Testing.annotationCommon))
            }
        }
        val androidMain by getting {
            dependencies {
                implementation(Ktor.android)
            }
        }
        val androidUnitTest by getting {
            dependencies {
                implementation(kotlin(Testing.kotlinJunit))
                implementation(Testing.junit)
            }
        }
        val iosMain by getting {
            dependencies {
                implementation(Ktor.ios)
            }
        }
        val iosTest by getting
    }
}

android {
    compileSdk = AndroidApp.compileSdk
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = AndroidApp.minSdk
        targetSdk = AndroidApp.targetSdk
    }
    namespace = "com.werockstar.gitkmm"
}