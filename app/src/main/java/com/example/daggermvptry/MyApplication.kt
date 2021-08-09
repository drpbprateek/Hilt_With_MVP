package com.example.daggermvptry

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication : Application(){

    override fun onCreate() {
        super.onCreate() //Injection happens here


    }
}