package me.francis.lifecycle

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.IBinder

class MainService : Service() {

    companion object {
        private val TAG = MainService::class.java.simpleName

        fun startMainService(context: Context) {
            var intent = Intent(context, MainService::class.java)
            context.startService(intent)
        }
    }

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onCreate() {
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
