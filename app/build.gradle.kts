plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.deepaksah.marrow.rebuild"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.deepaksah.marrow.rebuild"
        minSdk = 23
        targetSdk = 35
        versionCode = 155
        versionName = "0.1.0"
    }

    signingConfigs {
        getByName("debug") {
            enableV1Signing = true
            enableV2Signing = true
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlin {
        jvmToolchain(17)
    }
}
