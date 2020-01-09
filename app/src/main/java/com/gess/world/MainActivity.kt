package com.gess.world

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.gess.world.ui.main.HotFragment
import com.gess.world.ui.main.RelationFragment
import com.gess.world.ui.main.SearchFragment
import com.gess.world.ui.main.UserFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
    ,HotFragment.OnFragmentInteractionListener
    ,SearchFragment.OnFragmentInteractionListener
    ,RelationFragment.OnFragmentInteractionListener
    ,UserFragment.OnFragmentInteractionListener{

//    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setSupportActionBar(toolbar)
        lifecycle.addObserver(MainObserver())

        val navView: BottomNavigationView = bnv_main
        val navController = findNavController(R.id.nav_main_act)

        navView.setupWithNavController(navController)


//        fab.setClickListener {
//            Snackbar.make(it, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }


    }


    override fun onFragmentInteraction(uri: Uri) {
    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        return when (item.itemId) {
//            R.id.action_settings -> true
//            else -> super.onOptionsItemSelected(item)
//        }
//    }
}