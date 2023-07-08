package com.amit.multimodulecleanarch.main.startup

import android.content.Context
import androidx.startup.Initializer
import com.amit.multimodulecleanarch.main.startup.di.CommonInitializerImp
import com.amit.multimodulecleanarch.main.startup.di.appstartup.AppInitializerProvider
import dagger.hilt.android.EntryPointAccessors

class StartUpAppInitializers : Initializer<Unit> {
    override fun create(context: Context) {
        val  entryPointAccessor = EntryPointAccessors.fromApplication(
            context, AppInitializerProvider::class.java
        )
        CommonInitializerImp(entryPointAccessor).apply {
           initProperties()
            syncAllData()

        }
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}