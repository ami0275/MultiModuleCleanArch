import org.jetbrains.kotlin.kapt3.base.Kapt.kapt
plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.amit.featuresecond"
    compileSdk = 33

    defaultConfig {
        minSdk = 24


        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(Deps.core)
    implementation(Deps.appCompat)
    implementation(Deps.androidMaterial)
    testImplementation(TestImplementation.junit)
    testImplementation(AndroidTestImplementation.junit)
    testImplementation(AndroidTestImplementation.espresso)

    implementation (DaggerHilt.hilt)

    kapt(DaggerHilt.hiltAndroidCompiler)
    kapt(DaggerHilt.hiltCompiler)
}