package com.example.kotlinproyect

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_cat.setOnClickListener {
            var song: MediaPlayer? = MediaPlayer.create(this, R.raw.friends)
            song?.start()
        }
    }
}
