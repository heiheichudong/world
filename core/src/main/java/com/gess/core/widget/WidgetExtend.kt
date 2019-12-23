package com.gess.core.widget

import android.view.View

fun View.setClickListener(block: (v: View) -> Unit) {
    setOnClickListener {
        isClickable = false
        block(it)
        postDelayed({ isClickable = true }, 1000)
    }
}

