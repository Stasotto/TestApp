package com.example.testapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class Fragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_3, container, false)
    }

    companion object {
        const val TAG3 = "com.example.testapp.Fragment3"
        @JvmStatic
        fun newInstance() = Fragment3()
    }

    override fun onDetach() {
        super.onDetach()
        FirstFragment.counterFragment--
    }
}