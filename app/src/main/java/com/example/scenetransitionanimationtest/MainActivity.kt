package com.example.scenetransitionanimationtest

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import com.example.scenetransitionanimationtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.textViewMain.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
//            //轉場動畫1 -> 爆炸效果
////            intent.putExtra("type", "explode")
//            //轉場動畫2 -> view接續效果
//            val activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
//                this,
//                Pair(binding.textViewMain, "textView")
//            )
//            startActivity(
//                intent,
//                activityOptions.toBundle()
//            )
            //預設manifest設定的CustomActivityAnimation轉場動畫效果
            startActivity(intent)
        }
    }
}