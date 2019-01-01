package me.francis.lifecycle.net;

import okhttp3.MediaType;

/**
 * Created by yun.feng on 2018/12/31.
 */
public class NetConfig {

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public static String Sample_post = "http://192.168.31.52:8081/sample_post/upload/json";
}
