package com.example.testapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    companion object {
        const val TAG2 = "com.example.testapp.Fragment2"
        @JvmStatic
        fun newInstance() = Fragment2()
    }

    override fun onDetach() {
        super.onDetach()
        FirstFragment.counterFragment--
    }
}