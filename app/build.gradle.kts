plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.deepaksah.marrow.rebuild"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.deepaksah.marrow.rebuild"
        // The app only uses APIs available since Android 6.0. Keeping this at 23
        // lets the debug APK install on devices running Android 6.0 through 9.0;
        // a minSdk of 29 makes Android reject the APK on all older devices.
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
            assets {
                // The current runtime importer reads only the Edition 8 QBank.
                // Do not ship the unrelated recovered test-series archives in the
                // base APK: they add about 300 MB and can make installation fail on
                // devices without enough free storage. Those archives remain in the
                // source tree for later on-demand content integration.
                exclude("marrow_content/Brain/Marrow/FMGE Mini Test Series/**")
                exclude("marrow_content/Brain/Marrow/FMGE Test Series/**")
                exclude("marrow_content/Brain/Marrow/FMGE Test Series subject/**")
                exclude("marrow_content/Brain/Marrow/NEET PG Mini Test Series/**")
                exclude("marrow_content/Brain/Marrow/NEET PG Subject Test Series/**")
                exclude("marrow_content/Brain/Marrow/NEET PG Test Series/**")
                exclude("marrow_content/Brain/Marrow/Previous Year Question Papers/**")
            }
        }
    }
}
