package me.francis.databinding.java;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import me.francis.databinding.R;
import me.francis.databinding.databinding.ActivityTest3Binding;

public class Test3Activity extends AppCompatActivity {

    private ActivityTest3Binding binding;

    public static void toTest3Activity(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, Test3Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_test3);
    }
}
