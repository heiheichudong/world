package com.gess.core.utils

import android.util.Log
import com.gess.core.BuildConfig

val PORJECT = "projectLog"
val mDubeg = BuildConfig.DEBUG

object Logger {

    @JvmStatic
    fun e(message: String) {
        if (mDubeg) {
            Log.e(PORJECT, message)
        }
    }

    @JvmStatic
    fun d(message: String) {
        if (mDubeg) {
            Log.d(PORJECT, message)
        }
    }
}
