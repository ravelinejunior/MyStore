package com.raveline.mystore

import android.app.Application
import com.raveline.mystore.di.initializeKoin
import com.raveline.shared.FirebaseStore
import org.koin.android.ext.koin.androidContext

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initializeKoin(
            config = {
                androidContext(this@MyApplication)
            }
        )
        FirebaseStore.initialize(this)
    }
}