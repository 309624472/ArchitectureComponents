package me.francis.databinding.java;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import me.francis.databinding.R;
import me.francis.databinding.java.model.AddressEntity;
import me.francis.databinding.java.model.UserEntity;
import me.francis.databinding.databinding.ActivityTest1Binding;

/**
 * DataBinding 拿到布局中的view
 */
public class Test1Activity extends AppCompatActivity {

    private ActivityTest1Binding binding;

    public static void toTest1Activity(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, Test1Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_test1);
        binding.testTv.setText("haha");

        UserEntity userEntity = new UserEntity();
        userEntity.setName("fengyun");
        userEntity.setAddr("shanghai");
        userEntity.setAge(1);
        binding.setUserEntity(userEntity);

        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setProvince("shanghai");
        addressEntity.setCity("minhang");
        binding.setAddressEntity(addressEntity);
    }
}
