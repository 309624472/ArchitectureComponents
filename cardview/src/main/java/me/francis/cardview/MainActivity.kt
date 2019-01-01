package me.francis.cardview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            replaceFragmentInActivity(obtainViewFragment(),R.id.container)
        }
    }

    private fun obtainViewFragment() = supportFragmentManager.findFragmentById(R.id.container)
        ?: CardViewFragment.newInstance()
}
