package com.devjurnal.ankokotlinapp

import android.annotation.SuppressLint
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class LayoutActivity : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_layout)


        // TODO Layouting from ANKO

//        linearLayout {
//            orientation= LinearLayout.VERTICAL
//        }
        // TODO 3 Memanggil Layout
        ViewAnkoMain().setContentView(this)

    }

    class ViewAnkoMain : AnkoComponent<LayoutActivity> {

        // TODO 2 Ganti ": View" dengan "= with(ui)"
//        override fun createView(ui: AnkoContext<LayoutActivity>): View {

        @SuppressLint("ResourceType")
        override fun createView(ui: AnkoContext<LayoutActivity>) = with(ui) {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            verticalLayout {
                padding = 30

                var name = editText {
                    hint = "input name"
                }.lparams{
                    width = matchParent
                    height = wrapContent
                }// End Of EditText

                button {
                    text = "Submit"
                    onClick {
                        if(name.text.isNotEmpty()) {
                            toast("${name.text}")
                        } else{
                            toast("kosong")
                        }
                    }
                }.lparams{
                    margin = 40
                }// End Of Button

                relativeLayout {

                    textView {
                        text = "Ini latihan Layout Dengan ANKO"
                        id   = 2
                    }
                    var text2 = textView{
                        text = "halo ini text view"
                        textSize = 20f
                        id = 1
                    }.lparams {
                        below(2)
                    }

                    button {
                        backgroundColor = Color.GREEN
                        text = "Submit 2"
                        onClick {
                            toast("halo")
                        }
                    }.lparams {
                        below(1)
                        width = matchParent
//                        backgroundColor = R.color.abc_color_highlight_material
                    }// End of Button
                }// End of Relative
            }// End of VerticalLayout
        }
    }
}
