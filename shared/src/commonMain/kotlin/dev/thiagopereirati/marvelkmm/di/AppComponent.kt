package dev.thiagopereirati.marvelkmm.di

import org.koin.core.context.startKoin

fun appComponent() = startKoin {
    modules(RemoteModule().providesModule)
}
