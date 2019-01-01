package me.francis.databinding.kotlin

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import me.francis.databinding.R
import me.francis.databinding.databinding.ActivityKotlinSampleBinding

class KotlinSampleActivity : AppCompatActivity() {

    lateinit var binding: ActivityKotlinSampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_kotlin_sample)
    }

    companion object {
        fun toKotlinSampleActivity(context: Context) {
            val intent = Intent(context, KotlinSampleActivity::class.java).apply {

            }
            context.startActivity(intent)
        }
    }
}
