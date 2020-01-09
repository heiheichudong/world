package com.gess.core.http.dsl

import com.gess.core.http.union.httpClientBuilder
import okhttp3.OkHttpClient
import java.io.IOException

@DslMarker
annotation class DSLHTTP

class HttpClient<T>(
    var url:String,
    var method:String,
    var builder:OkHttpClient.Builder,
    var onSucceed:((T)->Unit)?,
    var onFailure:((IOException)->Unit)?
)


@DSLHTTP
class ClientBuilder<T>{
    var url: String = ""
    var method:String = "post"
    var builder:OkHttpClient.Builder = httpClientBuilder
    var succeed: ((T) -> Unit)? = null
    var failure:((IOException)->Unit)? = null
    fun build():HttpClient<T> =
        HttpClient(url,method,builder,succeed,failure)

}