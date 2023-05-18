plugins {
    id(AndroidApp.androidApplicationModule)
    kotlin(KotlinPlugins.android)
    kotlin(KotlinPlugins.kapt)
    id(Hilt.hiltPlugin)
    id(AndroidApp.detekt).version(AndroidApp.detektVersion)
    id(Testing.snapshotTest)
    id("com.google.gms.google-services")
}

detekt {
    buildUponDefaultConfig = true
    allRules = false
    config = files("$projectDir/config/detekt.yml")
}


dependencies {
    implementation(project(":shared"))
    implementation(AndroidApp.appCompat)
    implementation(AndroidApp.constraintLayout)

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
    implementation(platform(AndroidApp.firebaseBom))
    implementation(AndroidApp.firebaseAnalytics)
    debugImplementation(Compose.composeUITestManifest)

    implementation(Hilt.hiltAndroid)
    implementation(Hilt.hiltViewModel)
    kapt(Hilt.hiltCompiler)

    testImplementation(Testing.junit)
    androidTestImplementation(Testing.junit)
    androidTestImplementation(Compose.composeJUnitUITest)
    androidTestImplementation(Compose.composeUITestManifest)
}

android {
    compileSdk = AndroidApp.compileSdk
    buildToolsVersion = AndroidApp.buildTools
    defaultConfig {
        applicationId = AndroidApp.applicationId
        minSdk = AndroidApp.minSdk
        targetSdk = AndroidApp.targetSdk
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "com.karumi.shot.ShotTestRunner"
        testApplicationId = "${AndroidApp.applicationId}.test"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isDebuggable = false
            isShrinkResources = true
        }
        getByName("debug") {
            isDebuggable = true
            isShrinkResources = false
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        compose = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Compose.composeCompilerVersion
    }
    namespace = AndroidApp.applicationId
    testNamespace = "com.werockstar.gitkmm.android.test"
}

shot {
    tolerance = 0.15
    showOnlyFailingTestsInReports = true
}