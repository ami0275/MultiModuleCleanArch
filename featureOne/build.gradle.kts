plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id ("com.google.dagger.hilt.android")
}

android {
    namespace = "com.amit.featureone"
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
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {

    implementation(project(mapOf("path" to ":featureBase")))
    implementation(project(mapOf("path" to ":common")))

    implementation(Deps.core)
    implementation(Deps.appCompat)
    implementation(Deps.androidMaterial)
    testImplementation(TestImplementation.junit)
    testImplementation(AndroidTestImplementation.junit)
    testImplementation(AndroidTestImplementation.espresso)
    implementation(Deps.constraintLayout)
    implementation(DaggerHilt.hilt)

    //DaggerHilt
    implementation(Coroutines.coroutineCore)
    implementation(Coroutines.coroutineAndroid)
    implementation(CoroutinesLifecycleScope.lifecycleViewModel)
    implementation(CoroutinesLifecycleScope.lifeCycleRuntime)
    implementation(Coil.coil)
    implementation(ViewModelDelegate.viewModelDeligate)
    //Timber
    implementation(Timber.timber)
    //Retrofit
    implementation(Retrofit.retrofit)
    implementation(Retrofit.gsonConvertor)
    implementation(Retrofit.okHttp)





    kapt(DaggerHilt.hiltAndroidCompiler)
    kapt(DaggerHilt.hiltCompiler)

    implementation(Room.room)
    kapt(Room.roomCompiler)

    // navigation component
    implementation(Navigation.fragment)
    implementation(Navigation.navigationUI)
    implementation(Navigation.runtime)

    implementation(Android.lifecycle)
    implementation(Android.startUp)
    implementation(Android.databinding)
    implementation(Android.crashlytics)
    implementation(Worker.workManager)
}