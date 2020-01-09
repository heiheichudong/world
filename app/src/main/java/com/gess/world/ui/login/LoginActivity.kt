package com.gess.world.ui.login

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gess.world.R

class LoginActivity : AppCompatActivity(),
    WelcomeFragment.OnFragmentInteractionListener,
    LoginFragment.OnFragmentInteractionListener,
    RegisterFragment.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun onFragmentInteraction(uri: Uri) {

    }
}
