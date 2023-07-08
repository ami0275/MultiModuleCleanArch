package com.amit.multimodulecleanarch.main.startup.di


import com.amit.multimodulecleanarch.main.startup.di.appstartup.AppInitializerProvider
import javax.inject.Inject


class CommonInitializerImp @Inject constructor(private val appInitializerProvider: AppInitializerProvider) :
    AppInitializersImpl {
    override fun initProperties() {
        TODO("Not yet implemented")
    }

    override fun syncAllData() {
        TODO("Not yet implemented")
    }


}

