plugins {
    id("com.google.dagger.hilt.android")
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    namespace = "bluecodex.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "bluecodex.app"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "0.1"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.14"
    }
}

dependencies {
    implementation(project(":core"))
    implementation(project(":data"))
    implementation(project(":storage"))
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.activity:activity-compose:1.9.0")
    implementation("androidx.compose.ui:ui:1.6.3")
    implementation("androidx.compose.material3:material3:1.2.1")
    implementation("com.google.dagger:hilt-android:2.50")
    kapt("com.google.dagger:hilt-compiler:2.50")
}
