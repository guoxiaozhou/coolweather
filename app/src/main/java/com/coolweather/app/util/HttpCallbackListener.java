package com.coolweather.app.util;

/**
 * Created by xz on 2016/2/11.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
