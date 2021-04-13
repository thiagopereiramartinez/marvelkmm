package dev.thiagopereirati.marvelkmm.remote

import dev.thiagopereirati.marvelkmm.extensions.md5
import okhttp3.Interceptor
import okhttp3.Response
import java.util.*

class AuthInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val ts = Calendar.getInstance().timeInMillis.toString()
        return chain.proceed(request.newBuilder()
            .url(request.url.newBuilder()
                .addQueryParameter("apikey", "5a71718988e951cd0d95dd94710f7285")
                .addQueryParameter("ts", ts)
                .addQueryParameter("hash", "%s%s%s".format(ts, "dbd4e232fc63d0560e90ea297f87f0f394e848f1", "5a71718988e951cd0d95dd94710f7285").md5)
                .build()
            )
            .build())
    }

}