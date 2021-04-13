package dev.thiagopereirati.marvelkmm.android

import android.app.Application
import dev.thiagopereirati.marvelkmm.di.appComponent

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        appComponent()
    }

}