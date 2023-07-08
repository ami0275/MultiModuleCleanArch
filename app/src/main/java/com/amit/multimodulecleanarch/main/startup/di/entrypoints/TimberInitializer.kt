package com.amit.multimodulecleanarch.main.startup.di.entrypoints

import android.content.Context
import androidx.startup.Initializer
import com.amit.multimodulecleanarch.BuildConfig
import timber.log.Timber

class TimberInitializer :Initializer<Unit>{
    override fun create(context: Context) {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
           // Timber.plant(ReleaseTree())
        }
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}