package com.example.scenetransitionanimationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Explode
import android.transition.Fade
import android.transition.Slide
import androidx.core.view.ViewCompat
import com.example.scenetransitionanimationtest.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)

        val type:String? = intent.getStringExtra("type")
        if  (type != null){
            init(type)
        }

//        setContentView(R.layout.activity_second)
        setContentView(binding.root)

        /*
            也可以在兩個layout的xml裡分別對view設定android:transitionName="textView"
            就可以不用設定ViewCompat.setTransitionName
         */
//        ViewCompat.setTransitionName(binding.textViewSecond, "textView")
    }
    private fun init(type: String) {
        when (type) {
            "explode" -> {
                val explodeTransition = Explode()
                explodeTransition.duration = 2000
                window.enterTransition = explodeTransition
                window.exitTransition = explodeTransition
            }

            "slide" -> {
                val slideTransition = Slide()
                slideTransition.duration = 2000
                window.enterTransition = slideTransition
                window.exitTransition = slideTransition
            }

            "fade" -> {
                val fadeTransition = Fade()
                fadeTransition.duration = 2000
                window.enterTransition = fadeTransition
                window.exitTransition = fadeTransition
            }
        }
    }
}