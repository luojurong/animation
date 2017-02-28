package com.animation.animation.http;

import android.util.Log;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

/**
 * Created by luojurong on 2017/2/28.
 */

public class HttpUtils {
    public void hotDownLoad(String url){
        Log.e("---------","---");
        RequestParams params = new RequestParams(url);
        params.addHeader("head","android-");
        Callback.Cancelable cancelable = x.http().post(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.e("---------", result + "");
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
        cancelable.cancel();
    }
}
