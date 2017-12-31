package com.devjurnal.ankokotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCommonAnko.onClick {
//            startActivity(Intent(this@MainActivity, CommonActivity::class.java))
//            anko send data putEXTRA PARCELABLE
//            startActivity(intentFor<CommonActivity>(CommonActivity().DATA_EXTRA to 100
//            ,"key" to 101))

            // anko send data putExtra
            startActivity(intentFor<CommonActivity>(
                    "key" to 101,
                    CommonActivity().DATA_EXTRA to 120))

        }

        btnLayout.onClick {
//            startActivity(Intent(this@MainActivity, LayoutActivity::class.java))
            startActivity(intentFor<LayoutActivity>())
        }
    }
}
