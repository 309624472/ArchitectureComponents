package me.francis.databinding.kotlin

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import me.francis.databinding.R
import me.francis.databinding.databinding.ActivityTest1Binding

class KTest1Activity : AppCompatActivity() {

    lateinit var binding: ActivityTest1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_ktest1)
    }
}
