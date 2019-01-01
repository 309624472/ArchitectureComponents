package me.francis.databinding

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.feng.databinding_sample.kotlin.KotlinSampleActivity
import me.francis.databinding.java.JavaSampleActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var javaBtn = findViewById<Button>(R.id.java_btn)
        var kotlinBtn = findViewById<Button>(R.id.kotlin_btn)
        javaBtn.setOnClickListener {
            JavaSampleActivity.toJavaSampleActivity(this@MainActivity)
        }

        kotlinBtn.setOnClickListener {
            KotlinSampleActivity.toKotlinSampleActivity(this@MainActivity)
        }
    }
}
