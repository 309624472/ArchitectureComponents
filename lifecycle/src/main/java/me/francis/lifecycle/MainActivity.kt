package me.francis.lifecycle

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import org.jetbrains.anko.alert
import org.jetbrains.anko.noButton
import org.jetbrains.anko.toast
import org.jetbrains.anko.yesButton

class MainActivity : AppCompatActivity() {

    private lateinit var openAlertBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openAlertBtn = findViewById<Button>(R.id.openAlertBtn)
        MainService.startMainService(this)

        openAlertBtn.setOnClickListener {
            alert {
                alert("Hi, I'm Francis", "Have you tried turning it off and on again?") {
                    yesButton { toast("yes") }
                    noButton { toast("no") }
                }.show()
            }
        }
    }
}
