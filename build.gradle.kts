buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}")
        classpath("com.android.tools.build:gradle:7.4.0")
        classpath("com.google.dagger:hilt-android-gradle-plugin:${Hilt.version}")
        classpath("com.karumi:shot:5.14.1")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}