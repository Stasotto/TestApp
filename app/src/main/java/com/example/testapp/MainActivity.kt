package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.testapp.fragments.FirstFragment
import com.example.testapp.fragments.SecondFragment
import com.example.testapp.fragments.ThirdFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        btn.setOnClickListener {
//            println(supportFragmentManager.findFragmentByTag(FirstFragment.TAG))
//            println(FirstFragment.newInstance())
            check()
            }
        }

    private fun check() {
        if(supportFragmentManager.findFragmentByTag(FirstFragment.TAG) == null) {
            openFragment(FirstFragment.newInstance(), FirstFragment.TAG)
            return
        }
        if(supportFragmentManager.findFragmentByTag(SecondFragment.TAG2) == null) {
            openFragment(SecondFragment.newInstance(), SecondFragment.TAG2)
            return
        }
        if(supportFragmentManager.findFragmentByTag(ThirdFragment.TAG3) == null) {
            openFragment(ThirdFragment.newInstance(), ThirdFragment.TAG3)
            return
        }
    }

    private fun openFragment(fragment: Fragment, tag: String) {
        supportFragmentManager
            .beginTransaction()
            .addToBackStack(tag)
            .replace(R.id.container, fragment, tag)
            .commit()
    }
}