plugins {
    id("com.android.application")
    kotlin(KotlinPlugins.android)
    kotlin(KotlinPlugins.kapt)
    id(Hilt.hiltPlugin)
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.1")

    implementation(Compose.runtime)
    implementation(Compose.runtimeLiveData)
    implementation(Compose.ui)
    implementation(Compose.material)
    implementation(Compose.uiTooling)
    implementation(Compose.foundation)
    implementation(Compose.compiler)
    implementation(Compose.activity)
    implementation(Compose.navigation)
    implementation(Compose.coil)
    implementation(Compose.accompanist)

    implementation(Hilt.hiltAndroid)
    implementation(Hilt.hiltViewModel)
    kapt(Hilt.hiltCompiler)
}

android {
    compileSdk = AndroidApp.compileSdk
    defaultConfig {
        applicationId = AndroidApp.applicationId
        minSdk = AndroidApp.minSdk
        targetSdk = AndroidApp.targetSdk
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        compose = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Compose.composeVersion
    }
}