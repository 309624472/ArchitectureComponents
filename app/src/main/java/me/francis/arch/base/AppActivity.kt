package me.francis.arch.base

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle

abstract class AppActivity<T : BaseViewModel> : BaseActivity() {

    protected lateinit var viewModel: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = initViewModel()
        initViewAndData()
        subscribeLiveData()
    }

    private fun initViewModel(): T {
        return ViewModelProviders.of(this, ViewModelFactory(application, arguments())).get(viewModelClass())
    }

    open fun initViewAndData() {

    }

    open fun subscribeLiveData() {

    }

    abstract fun viewModelClass(): Class<T>

    abstract fun arguments(): Bundle
}