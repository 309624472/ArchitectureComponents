package me.francis.arch.base

import android.app.Application
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle

class ViewModelFactory(val application: Application, val argument: Bundle) :
    ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val patams = arrayOf<Class<*>>(Application::class.java, Bundle::class.java)
        return modelClass.getConstructor(patams[0], patams[1]).newInstance(application, argument)
    }
}