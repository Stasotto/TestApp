package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        btn.setOnClickListener {
            when (FirstFragment.counterFragment) {
                0 -> {
                    openFragment()
                    ++FirstFragment.counterFragment
                }
                1 -> {
                    openFragment2()
                    ++FirstFragment.counterFragment
                }
                2 -> {
                    openFragment3()
                    ++FirstFragment.counterFragment
                }
            }
        }
    }

    private fun openFragment() {
        supportFragmentManager
            .beginTransaction()
            .addToBackStack(FirstFragment.TAG)
            .add(R.id.container, FirstFragment.newInstance())
            .commit()
    }

    private fun openFragment2() {
        supportFragmentManager
            .beginTransaction()
            .addToBackStack(Fragment2.TAG2)
            .add(R.id.container, Fragment2.newInstance())
            .commit()
    }

    private fun openFragment3() {
        supportFragmentManager
            .beginTransaction()
            .addToBackStack(Fragment3.TAG3)
            .add(R.id.container, Fragment3.newInstance())
            .commit()
    }
}