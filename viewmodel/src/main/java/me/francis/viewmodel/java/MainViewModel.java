package me.francis.viewmodel.java;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import me.francis.viewmodel.entity.UserEntity;

/**
 * Created by yun.feng on 2019/1/1.
 */
public class MainViewModel extends ViewModel {
    private MutableLiveData<UserEntity> userEntityMutableLiveData = new MutableLiveData<>();

    public LiveData<UserEntity> getUserEntity() {
        if (userEntityMutableLiveData == null) {
            userEntityMutableLiveData = new MutableLiveData<>();
        }
        return userEntityMutableLiveData;
    }

    public void setUserEntity(UserEntity userEntity) {
        if (userEntityMutableLiveData != null) {
            //只允许在主线程调用，如果在其他线程调用会报错
            userEntityMutableLiveData.setValue(userEntity);
            //允许后台线程向主进程推送数据(具体怎么实现看源码)
            userEntityMutableLiveData.postValue(userEntity);
        }
    }
}
