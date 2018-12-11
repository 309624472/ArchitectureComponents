package me.francis.arch.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bindLayout())
        lifecycle.addObserver(BaseActivityLifecycle(this))
    }

    /**
     * Activity 的 Layout questionId
     */
    abstract fun bindLayout(): Int
}