package dev.thiagopereirati.marvelkmm.di

import dev.thiagopereirati.marvelkmm.remote.AuthInterceptor
import dev.thiagopereirati.marvelkmm.remote.CharactersService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

actual class RemoteModule {

    actual val providesModule = module {
        factory { providesAuthInterceptor() }
        factory { providesHttpLoggingInterceptor() }
        factory { providesOkHttpClient(get(), get()) }
        factory { providesRetrofit(get()) }
        single { providesCharactersService(get()) }
    }

    private fun providesCharactersService(retrofit: Retrofit): CharactersService = retrofit.create(CharactersService::class.java)

    private fun providesRetrofit(okHttpClient: OkHttpClient): Retrofit = Retrofit.Builder()
        .baseUrl("https://gateway.marvel.com")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private fun providesOkHttpClient(authInterceptor: AuthInterceptor, httpLoggingInterceptor: HttpLoggingInterceptor) = OkHttpClient.Builder()
        .addInterceptor(authInterceptor)
        .addInterceptor(httpLoggingInterceptor)
        .build()

    private fun providesHttpLoggingInterceptor() = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    private fun providesAuthInterceptor() = AuthInterceptor()

}