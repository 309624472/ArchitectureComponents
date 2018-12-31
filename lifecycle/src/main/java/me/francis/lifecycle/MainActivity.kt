package me.francis.lifecycle

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import me.francis.lifecycle.lifecycle.LifecycleActivity
import me.francis.lifecycle.origin.OriginActivity

/**
 * Lifecycle 生命周期
 * LifecycleOwner 生命周期所有者
 * LifecycleRegistry 弱引用持有LifecycleObserver，将LifecycleOwner的状态同步给LifecycleObserver
 * LifecycleDispatcher
 *
 * LifecycleObserver 生命周期观察者
 * DefaultLifecycleObserver
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        button1.setOnClickListener {
            val intent = Intent(this, OriginActivity::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, LifecycleActivity::class.java)
            startActivity(intent)
        }
    }
}
