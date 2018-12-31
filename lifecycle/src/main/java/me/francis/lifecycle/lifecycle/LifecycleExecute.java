package me.francis.lifecycle.lifecycle;

import android.app.AlertDialog;
import android.app.Dialog;
import android.arch.lifecycle.DefaultLifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;

import me.francis.lifecycle.R;
import me.francis.lifecycle.UserEntity;
import me.francis.lifecycle.net.JSONUtil;
import me.francis.lifecycle.net.NetConfig;
import okhttp3.*;

import java.io.IOException;

import static me.francis.lifecycle.App.mainHandler;

/**
 * Created by yun.feng on 2018/12/31.
 */
public class LifecycleExecute implements DefaultLifecycleObserver {

    private Context mContext;
    private Dialog mDialog;
    private OnExecuteListener listener;
    private OkHttpClient mOkHttpClient;

    public LifecycleExecute(LifecycleOwner lifecycleOwner, Context context) {
        lifecycleOwner.getLifecycle().addObserver(this);
        this.mContext = context;
        mOkHttpClient = new OkHttpClient.Builder().build();
    }

    public void doSomething() {
        UserEntity userEntity = new UserEntity("francis", "1");
        RequestBody requestBody = RequestBody.create(NetConfig.JSON, JSONUtil.toJson(userEntity));
        Request request = new Request.Builder()
                .url(NetConfig.Sample_post)
                .post(requestBody)
                .build();
        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                mainHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (listener != null) {
                            listener.executeFailed();
                        }
                    }
                });
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                mainHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (listener != null) {
                            listener.executeSuccess();
                        }
                    }
                });
            }
        });
    }

    public void showDialog() {
        View view = View.inflate(mContext, R.layout.dialog_test, null);
        AlertDialog.Builder builder = new AlertDialog
                .Builder(mContext)
                .setView(view);
        if (mDialog == null || !mDialog.isShowing()) {
            mDialog = builder.create();
        }
        mDialog.show();
    }

    public void setExecuteListener(OnExecuteListener listener) {
        this.listener = listener;
    }

    public interface OnExecuteListener {
        void executeSuccess();

        void executeFailed();
    }

    @Override
    public void onDestroy(@NonNull LifecycleOwner owner) {
        listener = null;
        mOkHttpClient = null;
        if (mDialog != null) {
            mDialog.dismiss();
        }

    }
}
