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
        String url1 = "api.xinmanhua.net/v2/hotpage";
//                "devid=Abe6978500b5004afbab14131d7139c1b
// &userid=0&xid=&iver=v2&net=1" +
//                "&telecomvendor=1&mobilevendor=smartisan|YQ601&appver=2.1.3" +
//                "&osver=android4.4.2&origin=bdx&tm=1487238023";
        RequestParams params = new RequestParams(url);
    //    params.addBodyParameter();
    //    params.addParameter();
        params.addParameter("devid","Abe6978500b5004afbab14131d7139c1b");
        params.addParameter("userid","0");
        params.addParameter("xid","");
        params.addParameter("iver","v2");
        params.addParameter("net","1");
        params.addParameter("telecomvendor","1");
        params.addParameter("mobilevendor","smartisan|YQ601");
        params.addParameter("appver","2.1.3");
        params.addParameter("osver","android4.4.2");
        params.addParameter("origin","bdx");
        params.addParameter("tm","1487238023");
        params.addHeader("head","android");
        x.http().post(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.e("-------",result+"----");
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Log.e("-------","----error");
                ex.printStackTrace();
            }

            @Override
            public void onCancelled(CancelledException cex) {
                Log.e("-------","----onCancelled");
            }

            @Override
            public void onFinished() {
                Log.e("-------","----onFinished");
            }
        });
    }
}
