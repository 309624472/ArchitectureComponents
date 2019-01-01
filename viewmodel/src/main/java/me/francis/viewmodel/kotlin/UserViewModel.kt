package me.francis.viewmodel.kotlin

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import me.francis.viewmodel.entity.UserEntity

/**
 * Created by yun.feng on 2019/1/1.
 */
class UserViewModel : ViewModel() {
    private lateinit var userMutableLiveData: MutableLiveData<UserEntity>

    fun getUsers(): LiveData<UserEntity> {
        if (!::userMutableLiveData.isInitialized) {
            userMutableLiveData = MutableLiveData()
            loadUsers()
        }
        return userMutableLiveData
    }

    private fun loadUsers() {
        // Do an asynchronous operation to fetch users.
        // 执行异步操作 获取users数据
    }
}