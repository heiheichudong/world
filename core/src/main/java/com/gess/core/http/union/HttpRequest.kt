package com.gess.core.http.union

import com.gess.core.utils.Logger
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okio.Buffer
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.nio.charset.Charset


val httpClientBuilder = OkHttpClient()
    .newBuilder()
    .connectTimeout(TIMEOUT_CONNECTION)
    .readTimeout(TIMEOUT_READ)
    .writeTimeout(TIMEOUT_WRITE)
    .retryOnConnectionFailure(true)

fun <T> rxService(clazz: Class<T>, url: String, factory: Converter.Factory): T = Retrofit.Builder()
    .baseUrl(url)
    .client(httpClientBuilder.build())
    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
    .addConverterFactory(factory)
    .build()
    .create(clazz)

fun <T> rxService(clazz: Class<T>, url: String): T =
    rxService(clazz, url, GsonConverterFactory.create())

fun handle(chain: Interceptor.Chain) {
    val body = chain.request().body
    var requestStr = ""
    body?.apply {
        if (contentType().toString().contains("multipart")) {
            val buffer = Buffer()
            writeTo(buffer)
            var charset = Charset.forName("UTF-8")
            charset = contentType()?.charset(charset)
            requestStr = buffer.readString(charset)
        }
        Logger.e("*********************************************************************************************************")
        Logger.e("* 请求方式：" + chain.request().method)
        Logger.e("* 请求链接：" + chain.request().url)
        Logger.e("* 请求头部：" + chain.request().headers)
        Logger.e("* 请求体：  $requestStr")
        Logger.e("*********************************************************************************************************")
    }
}