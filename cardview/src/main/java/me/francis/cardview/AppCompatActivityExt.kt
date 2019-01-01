package me.francis.cardview

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.annotation.IdRes
import android.support.v7.app.AppCompatActivity

fun AppCompatActivity.replaceFragmentInActivity(fragment: Fragment, @IdRes frameId: Int) {
    supportFragmentManager.transact {
        replace(frameId, fragment)
    }
}

fun AppCompatActivity.addFragmentToActivity(fragment: Fragment, tag: String) {
    supportFragmentManager.transact {
        add(fragment, tag)
    }
}

private inline fun FragmentManager.transact(action: FragmentTransaction.() -> Unit) {
    // Run 和 Apply差不多
    // 区别是 Apply返回该对象（this） 而 Run返回最后一行代码
    beginTransaction().apply {
        action()
    }.commit()
}