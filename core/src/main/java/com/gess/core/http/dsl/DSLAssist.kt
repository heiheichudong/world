package com.gess.core.http.dsl

@DslMarker
annotation class DSLHTTP

class HttpClient(
    var url:String,
    var method:String
)

@DSLHTTP
class ClientBuilder{
    var url: String = ""
    var method:String = "post"
    fun build():HttpClient =
        HttpClient(url,method)
}