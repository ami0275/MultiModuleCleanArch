object Versions {
    const val core = "1.10.1"
    const val appcompat = "1.6.1"
    const val androidMaterial = "1.9.0"
    const val constraintLayout = "2.1.4"

    const val testImplJunit = "4.13.2"
    const val androidTestImplJunit = "1.1.5"
    const val androidTestEspresso = "3.5.1"

    const val retrofit = "2.9.0"
    const val gsonConvertor = "2.9.0"
    const val okHttp = "4.9.0"
    const val scalerConvertor = "2.1.0"

    const val kotlinCoroutines = "1.6.1"

    const val coroutineLifecycleScope = "2.6.1"

    const val coilVer = "2.2.2"

    const val viewModelDeligate = "1.6.0"

    const val dagger = "2.45"
    const val hiltCompiler = "1.0.0"

    const val roomVersion = "2.5.2"

    const val swipeRefresh = "1.1.0"

    const val lottieAnimations = "3.4.2"

    const val timberVersion = "5.0.1"

    const val lifeCycleVersion = "2.6.1"

    const val startUpVersion = "1.1.1"

    const val databindingVersion =  "8.0.2"

    const val crashlyticsVersion=  "18.3.7"

    const val workManagerVersion =  "2.8.1"

    const val navigationVersion = "2.6.0"
}

object Deps {

    const val core = "androidx.core:core-ktx:${Versions.core}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val androidMaterial = "com.google.android.material:material:${Versions.androidMaterial}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

}

object TestImplementation {

    const val junit = "junit:junit:${Versions.testImplJunit}"
}

object AndroidTestImplementation {

    const val junit = "androidx.test.ext:junit:${Versions.androidTestImplJunit}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.androidTestEspresso}"

}

object Android{
    const val lifecycle = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifeCycleVersion}"
    const val startUp =  "androidx.startup:startup-runtime:${Versions.startUpVersion}"
    const val databinding =  "androidx.databinding:databinding-runtime:${Versions.databindingVersion}"
    const val crashlytics =  "com.google.firebase:firebase-crashlytics-ktx:${Versions.crashlyticsVersion}"
}

object Navigation{
    const val fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
    const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"
    const val runtime = "androidx.navigation:navigation-runtime-ktx:${Versions.navigationVersion}"
}

object Worker{
    const val workManager =  "androidx.work:work-runtime-ktx:2.8.1"
}


object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gsonConvertor = "com.squareup.retrofit2:converter-gson:${Versions.gsonConvertor}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val scalersConvertors = "com.squareup.retrofit2:converter-scalars:${Versions.scalerConvertor}"
}

object Coroutines {
    const val coroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
    const val coroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinCoroutines}"
}

object CoroutinesLifecycleScope {
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.coroutineLifecycleScope}"
    const val lifeCycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.coroutineLifecycleScope}"
}

object Coil {
    const val coil = "io.coil-kt:coil:${Versions.coilVer}"
}

object ViewModelDelegate {
    const val viewModelDeligate = "androidx.activity:activity-ktx:${Versions.viewModelDeligate}"
}

object DaggerHilt {
    const val hilt = "com.google.dagger:hilt-android:${Versions.dagger}"
    const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${Versions.dagger}"
    const val hiltCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}"
}

object Room {
    const val roomCompiler = "androidx.room:room-compiler:${Versions.roomVersion}"
    const val room = "androidx.room:room-ktx:${Versions.roomVersion}"
}

object CircularProgressBar {
    const val swipeRefresh = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefresh}"
}

object LottieAnimations {
    const val lottieAnimations = "com.airbnb.android:lottie:${Versions.lottieAnimations}"
}

object Timber {
    const val timber = "com.jakewharton.timber:timber:${Versions.timberVersion}"
}

