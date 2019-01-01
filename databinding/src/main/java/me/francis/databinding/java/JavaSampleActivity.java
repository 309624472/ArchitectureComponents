package me.francis.databinding.java;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import me.francis.databinding.R;
import me.francis.databinding.databinding.ActivityJavaSampleBinding;

public class JavaSampleActivity extends AppCompatActivity {

    private ActivityJavaSampleBinding binding;

    public static void toJavaSampleActivity(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, JavaSampleActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_java_sample);
        binding.toTest1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Test1Activity.toTest1Activity(JavaSampleActivity.this);
            }
        });
        binding.toTest2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Test2Activity.toTest2Activity(JavaSampleActivity.this);
            }
        });
        binding.toTest3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Test3Activity.toTest3Activity(JavaSampleActivity.this);
            }
        });
        binding.toTest4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Test4Activity.toTest4Activity(JavaSampleActivity.this);
            }
        });
    }
}
