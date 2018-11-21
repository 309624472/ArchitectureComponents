package me.francis.work.main

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import me.francis.work.R

class MainActivity : AppCompatActivity() {

    lateinit var rootLayout: ConstraintLayout
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rootLayout = findViewById(R.id.rootLayout)
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        rootLayout.setOnClickListener {
            mainViewModel.onMainViewClicked()
        }
        mainViewModel.snackbar.observe(this, Observer { text ->
            text?.let {
                Snackbar.make(rootLayout, text, Snackbar.LENGTH_SHORT).show()
                mainViewModel.onSnackbarShown()
            }

        })
    }
}
