package com.liuxe.gaokaoass.http


import com.liuxe.gaokaoass.utils.NetWorkUtils
import com.liuxe.gaokaoass.App
import okhttp3.Cache
import okhttp3.CacheControl
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit

/**
 *
 * @time 2019/9/20 15:51
 * @describe describe
 *
 */

object RetrofitClient {

    val service by lazy { getService(Api::class.java, Api.BASE_URL) }


    private val client: OkHttpClient
        get() {
            val builder = OkHttpClient.Builder()
            val logging = LoggingInterceptor()

            builder.addInterceptor(logging)
                .connectTimeout(10, TimeUnit.SECONDS)
            val httpCacheDirectory = File(App.CONTEXT.cacheDir, "responses")
            val cacheSize = 10 * 1024 * 1024L // 10 MiB
            val cache = Cache(httpCacheDirectory, cacheSize)
            builder.cache(cache)
                .addInterceptor { chain ->
                    var request = chain.request()
                    if (!NetWorkUtils.isNetworkAvailable(App.CONTEXT)) {
                        request = request.newBuilder()
                            .cacheControl(CacheControl.FORCE_CACHE)
                            .build()
                    }
                    val response = chain.proceed(request)
                    if (!NetWorkUtils.isNetworkAvailable(App.CONTEXT)) {
                        val maxAge = 60 * 60
                        response.newBuilder()
                            .removeHeader("Pragma")
                            .header("Cache-Control", "public, max-age=$maxAge")
                            .build()
                    } else {
                        val maxStale = 60 * 60 * 24 * 28 // tolerate 4-weeks stale
                        response.newBuilder()
                            .removeHeader("Pragma")
                            .header("Cache-Control", "public, only-if-cached, max-stale=$maxStale")
                            .build()
                    }

                    response
                }

            return builder.build()
        }


    private fun <S> getService(serviceClass: Class<S>, baseUrl: String): S {
        return Retrofit.Builder()
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseUrl)
            .build().create(serviceClass)
    }



}

