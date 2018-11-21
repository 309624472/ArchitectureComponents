package me.francis.work.main

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import me.francis.work.util.AppExecutors

class MainViewModel : ViewModel() {

    private val snackBar = MutableLiveData<String>()
    private val appExecutors = AppExecutors()

    val snackbar: LiveData<String>
        get() = snackBar

    fun onMainViewClicked() {
        appExecutors.diskIO().execute {
            Thread.sleep(1000)
            snackBar.postValue("Hello, from threads!")
        }
    }

    fun onSnackbarShown() {
        snackBar.value = null
    }
}