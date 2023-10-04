package com.example.mad_practical_9_22012022014

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alaramanimation:AnimationDrawable
    lateinit var logoanimation:AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alaramimage=findViewById<ImageView>(R.id.Alaramimage)
        var logoimage=findViewById<ImageView>(R.id.Imagelogo)
        alaramimage.setBackgroundResource(R.drawable.alaram_animation_list)
        logoimage.setBackgroundResource(R.drawable.logoanimation)
        alaramanimation=alaramimage.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if (hasFocus){
            alaramanimation.start()
        }
        else{
            alaramanimation.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }

}