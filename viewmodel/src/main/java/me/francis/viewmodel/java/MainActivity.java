package me.francis.viewmodel.java;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

import me.francis.viewmodel.R;
import me.francis.viewmodel.entity.UserEntity;

/**
 * Created by yun.feng on 2019/1/1.
 */
public class MainActivity extends AppCompatActivity {
    private Button updataBtn;
    private TextView textView;

    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updataBtn = findViewById(R.id.updataBtn);
        textView = findViewById(R.id.text);
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        subscribeUI(mainViewModel);
        updataBtn.setOnClickListener(view -> updateUser());
    }

    private void updateUser() {
        String name = new Random().nextInt(10000) + "";
        int age = new Random().nextInt(20);
        mainViewModel.setUserEntity(new UserEntity(name, age));
    }

    private void subscribeUI(MainViewModel mainViewModel) {
        mainViewModel.getUserEntity().observe(this, new Observer<UserEntity>() {
            @Override
            public void onChanged(@Nullable UserEntity userEntity) {
                textView.setText(userEntity.toString());
            }
        });
    }

}
