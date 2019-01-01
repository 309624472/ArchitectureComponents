package me.francis.databinding.java;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import me.francis.databinding.R;
import me.francis.databinding.databinding.ActivityTest2Binding;

public class Test2Activity extends AppCompatActivity {

    private ActivityTest2Binding binding;

    public static void toTest2Activity(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, Test2Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_test2);
        binding.setTextColor(getResources().getColor(R.color.colorPrimary));
        binding.setTextSize(12);
    }
}
