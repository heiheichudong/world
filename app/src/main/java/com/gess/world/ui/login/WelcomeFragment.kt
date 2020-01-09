package com.gess.world.ui.login

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.gess.world.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [WelcomeFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [WelcomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WelcomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_welcome, container, false)
        view.findViewById<TextView>(R.id.tv_login).setOnClickListener {
            val navOptions = navOptions {
                anim {
                    popEnter = R.anim.slide_in_left // 进入页面动画
                    popExit = R.anim.slide_out_right
                    enter = R.anim.slide_in_right  // 弹出栈动画
                    exit = R.anim.slide_out_left

//                    enter = R.anim.nav_default_enter_anim // 进入页面动画
//                    exit = R.anim.nav_default_exit_anim
//                    popEnter = R.anim.nav_default_pop_enter_anim  // 弹出栈动画
//                    popExit = R.anim.nav_default_pop_exit_anim
                }
            }
            val bundle = Bundle()
            bundle.putString("user", "name")
            findNavController().navigate(R.id.loginFragment, bundle, navOptions)
        }
        view.findViewById<TextView>(R.id.tv_register).setOnClickListener {
            val navOptions = navOptions {
                anim {
//                    enter = R.anim.nav_default_enter_anim // 进入页面动画
//                    exit = R.anim.nav_default_exit_anim
//                    popEnter = R.anim.nav_default_pop_enter_anim  // 弹出栈动画
//                    popExit = R.anim.nav_default_pop_exit_anim

                    enter = R.anim.slide_in_left // 进入页面动画
                    exit = R.anim.slide_out_right
                    popEnter = R.anim.slide_in_right  // 弹出栈动画
                    popExit = R.anim.slide_out_left
                }
            }
            val bundle = Bundle()
            bundle.putString("user", "name")
            findNavController().navigate(R.id.registerFragment, bundle, navOptions)
        }

        // Inflate the layout for this fragment
        return view
    }

    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {
        listener?.onFragmentInteraction(uri)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment WelcomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            WelcomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
