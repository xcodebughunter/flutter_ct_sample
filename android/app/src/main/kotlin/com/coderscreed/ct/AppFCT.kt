package com.singoloDigital.ct

import com.clevertap.android.sdk.ActivityLifecycleCallback
import io.flutter.app.FlutterApplication

class AppFCT : FlutterApplication() {
    override fun onCreate() {
        ActivityLifecycleCallback.register(this)//<--- Add this before super.onCreate()
        super.onCreate()
    }
}