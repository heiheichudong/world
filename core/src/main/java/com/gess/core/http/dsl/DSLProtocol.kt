package com.gess.core.http.dsl

import okhttp3.Call
import okhttp3.Callback
import okhttp3.Request
import okhttp3.Response
import java.io.IOException


fun <T> http(block: ClientBuilder<T>.() -> Unit) {
    var builder = ClientBuilder<T>()
    builder.block()
    var client = builder.build()
    var okhttp = client.builder.build()
    var request: Request = Request.Builder().url(client.url).build()
    var call = okhttp.newCall(request)
    call.enqueue(object : Callback {
        override fun onFailure(call: Call, e: IOException) {
            client.onFailure?.invoke(e)
        }

        override fun onResponse(call: Call, response: Response) {
            client.onSucceed?.invoke(response.body?.string() as T)
        }
    })
}


fun <T> ClientBuilder<T>.onSucceed(block: (T) -> Unit) {
    succeed = block
}

fun <T> ClientBuilder<T>.onFailure(block: (IOException) -> Unit) {
    failure = block
}


/**
 * 使用
 *      http<VersionBean> {
 *          url = "http://mapi.com.tv/version/getNewestVersion.json?device=2"
 *          method = "post"

 *          onSucceed {
 *              runOnUiThread{
 *                  tv_holle.text = it.toString()
 *              }
 *          }
 *          onFailure {
 *
 *          }
 *      }
 */