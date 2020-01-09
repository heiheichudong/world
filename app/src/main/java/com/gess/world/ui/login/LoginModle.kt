package com.gess.world.ui.login

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.databinding.ObservableField
import com.gess.world.MainActivity

class LoginModle constructor(name: String, pw: String, context: Context) {
    var n = ObservableField<String>(name)
    var p = ObservableField<String>(pw)
    val context: Context = context

    /**
     * 用户名改变回调的函数
     */
    fun onNameChanged(s: CharSequence) {
        n.set(s.toString())
    }

    /**
     * 密码改变的回调函数
     */
    fun onPwdChanged(s: CharSequence, start: Int, before: Int, count: Int) {
        p.set(s.toString())
    }

    fun login() {
        if (n.get().equals("gess")
            && p.get().equals("999999")) {
            Toast.makeText(context, "账号密码正确", Toast.LENGTH_SHORT).show()
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }
    }
}