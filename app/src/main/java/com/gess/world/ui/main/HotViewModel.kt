package com.gess.world.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gess.core.http.union.rxService
import io.reactivex.schedulers.Schedulers


class HotViewModel :ViewModel(){
    val baidu = MutableLiveData<String>()

    fun getBaidu(){
        rxService(MainApi::class.java,"http://mapi.com.tv")
            .baidu("2")
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.io())
//            .subscribe (object :Observer<HttpResult<CheckUpdateBean>>{
//                override fun onComplete() {
//
//                }
//
//                override fun onSubscribe(d: Disposable) {
//
//                }
//
//                override fun onNext(t: HttpResult<CheckUpdateBean>) {
//                    baidu.postValue(t.toString())
//                }
//
//                override fun onError(e: Throwable) {
//
//                }
//
//            })
            .subscribe{
                baidu.postValue(it.toString())
            }


//        http<String> {
//            url = "https://www.baidu.com/"
//            method = "post"
//            onSucceed {
//                baidu.postValue(it)
//            }
//            onFailure {
//
//            }
//        }
    }
}


