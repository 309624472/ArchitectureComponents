package me.francis.lifecycle;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;

/**
 * Created by yun.feng on 2018/12/31.
 */
public class App extends Application {
    public static Handler mainHandler = new Handler(Looper.getMainLooper());

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
