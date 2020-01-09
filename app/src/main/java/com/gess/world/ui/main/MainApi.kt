package com.gess.world.ui.main

import com.gess.world.bean.CheckUpdateBean
import com.gess.world.bean.HttpResult
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface MainApi {

    @GET("/version/getNewestVersion.json")
    fun baidu(@Query("device") device:String):Observable<HttpResult<CheckUpdateBean>>
}