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
        versionCode = 1
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

    sourceSets {
        getByName("main") {
            assets.exclude("marrow_content/Brain/Marrow/FMGE Mini Test Series/**")
            assets.exclude("marrow_content/Brain/Marrow/FMGE Test Series/**")
            assets.exclude("marrow_content/Brain/Marrow/FMGE Test Series subject/**")
            assets.exclude("marrow_content/Brain/Marrow/NEET PG Mini Test Series/**")
            assets.exclude("marrow_content/Brain/Marrow/NEET PG Subject Test Series/**")
            assets.exclude("marrow_content/Brain/Marrow/NEET PG Test Series/**")
            assets.exclude("marrow_content/Brain/Marrow/Previous Year Question Papers/**")
        }
    }
}
