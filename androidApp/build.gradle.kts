plugins {
    id("com.android.application")
    kotlin("android")
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")

    // Jetpack Compose
    val composeVersion = "1.0.0-beta04"
    implementation("androidx.compose.ui:ui:$composeVersion")
    implementation("androidx.compose.ui:ui-tooling:$composeVersion")
    implementation("androidx.compose.foundation:foundation:$composeVersion")
    implementation("androidx.compose.material:material:$composeVersion")
    implementation("androidx.compose.material:material-icons-extended:$composeVersion")
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.0-alpha05")
    implementation("androidx.activity:activity-compose:1.3.0-alpha06")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha04")
    implementation("androidx.compose.runtime:runtime-livedata:$composeVersion")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:$composeVersion")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "dev.thiagopereirati.marvelkmm.android"
        minSdkVersion(21)
        targetSdkVersion(30)
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
        useIR = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.0-beta01"
    }
}