package me.francis.databinding.java;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import me.francis.databinding.R;
import me.francis.databinding.databinding.ActivityTest4Binding;

public class Test4Activity extends AppCompatActivity {

    private ActivityTest4Binding binding;

    public static void toTest4Activity(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, Test4Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_test4);
    }
}
