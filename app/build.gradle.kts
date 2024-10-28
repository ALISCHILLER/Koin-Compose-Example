plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    kotlin("kapt")
}

android {
    namespace = "com.msa.koin_compose_exmple"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.msa.koin_compose_exmple"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    // Allow references to generated code
    kapt {
        correctErrorTypes = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)


    // Ktor
    implementation (dependency.ktor.client.core)
    implementation (dependency.ktor.client.cio) // برای Android
    implementation (dependency.ktor.client.content.negotiation)
    implementation (dependency.ktor.serialization.kotlinx.json)
    implementation (dependency.ktor.client.logging)

    // Koin
    implementation (dependency.koin.core)
    implementation (dependency.koin.android)
    implementation (dependency.koin.androidx.compose)

    //Room Db
    implementation(dependency.androidx.room.runtime)
    // annotationProcessor(dependency.androidx.room.compiler)
    kapt(dependency.androidx.room.compiler)
    implementation(dependency.androidx.room.ktx)

    //
    // Kermit برای لاگ‌گیری
    implementation ("co.touchlab:kermit:1.0.0")
}