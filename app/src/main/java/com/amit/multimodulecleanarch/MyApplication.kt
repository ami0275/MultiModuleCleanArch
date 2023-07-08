package com.amit.multimodulecleanarch

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import androidx.startup.AppInitializer
import com.amit.common.utils.isNight
import com.amit.multimodulecleanarch.main.startup.StartUpAppInitializers
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber



@HiltAndroidApp
class MyApplication:Application() {


    override fun onCreate() {
        super.onCreate()
        // Get UI mode and set
        val mode = if (isNight()) {
            AppCompatDelegate.MODE_NIGHT_YES
        } else {
            AppCompatDelegate.MODE_NIGHT_NO
        }
        AppCompatDelegate.setDefaultNightMode(mode)
        Timber.i("Application starting up....")
    /*    AppInitializer.getInstance(this)
            .initializeComponent(StartUpAppInitializers::class.java)*/
        Timber.d("Analytics initialization ended")
    }
}