package com.example.blink

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        val animationView = findViewById(R.id.blink_view) as LottieAnimationView
        animationView.setAnimation("blink_faster.json")
        animationView.scale = 4.0f
        animationView.loop(true)
        animationView.playAnimation()
        */
    }
}
