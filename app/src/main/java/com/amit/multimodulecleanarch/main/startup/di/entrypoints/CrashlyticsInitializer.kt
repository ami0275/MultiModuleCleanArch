package com.amit.multimodulecleanarch.main.startup.di.entrypoints

import android.content.Context
import androidx.startup.Initializer
import com.amit.multimodulecleanarch.BuildConfig
import com.amit.multimodulecleanarch.main.startup.di.appstartup.AppInitializerProvider
import com.google.firebase.FirebaseApp
import com.google.firebase.crashlytics.FirebaseCrashlytics
import dagger.hilt.android.EntryPointAccessors

class CrashlyticsInitializer:Initializer<Unit> {
    override fun create(context: Context) {
        val  entryPointAccessor = EntryPointAccessors.fromApplication(
            context, AppInitializerProvider::class.java
        )
        FirebaseApp.initializeApp(context)
        entryPointAccessor.let {
            FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(!BuildConfig.DEBUG)
        }
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}