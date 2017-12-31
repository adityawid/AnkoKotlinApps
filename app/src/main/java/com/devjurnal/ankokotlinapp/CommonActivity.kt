package com.devjurnal.ankokotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_common.*
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class CommonActivity : AppCompatActivity() {
    val DATA_EXTRA = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common)

        var a = intent.getIntExtra("key", 0)

        var data = intent.getIntExtra(DATA_EXTRA,0)
        Log.d("LOG GET DATA", a.toString())
        toast(a.toString()+" = " + data.toString())

        btnCall.onClick {
            makeCall("+6281329804060")
        }

        btnSMS.onClick {
            sendSMS("081329804060", "ini pesan yang dikirim")
        }
        btnBrowse.onClick {
            browse("https://devjurnal.com")
        }

        btnShare.onClick {
            share("haloo", "adityawi2590@gmail.com")
        }

        btnEmail.onClick {
            email("adityawi2590@gmail.com", "ini subject ANKO", "uji coba send email")
        }

        btnAlert.onClick {
/*
            // versi 1
            alert ("halo halo ini alert"){
                cancelButton { toast("cancel") }
                yesButton { toast("Yes button clicked") }
            }.show()
*/

            //versi 2
            alert{
                title= "ini title alert"
                message = "ini pesan"

                positiveButton("yes" , onClicked = {
                    toast("ini tombol yes")
                })

                negativeButton("no", onClicked = {
                    toast("ini tombol no")
                })

                neutralPressed("ini neutral", onClicked = {
                    longToast("neutral")
                })
            }.show()
        }
    }
}
