package me.francis.databinding.kotlin

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import me.francis.databinding.R
import me.francis.databinding.databinding.ActivityKtest3Binding

class KTest3Activity : AppCompatActivity() {

    lateinit var binding: ActivityKtest3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_ktest3)
    }
}
