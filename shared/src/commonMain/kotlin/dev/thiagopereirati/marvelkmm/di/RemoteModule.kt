package dev.thiagopereirati.marvelkmm.di

import org.koin.core.module.Module

expect class RemoteModule constructor() {

    val providesModule: Module

}