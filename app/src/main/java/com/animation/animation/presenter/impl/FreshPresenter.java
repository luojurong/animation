package com.animation.animation.presenter.impl;

import android.util.Log;

import com.animation.animation.presenter.IFreshPresenter;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

/**
 * 更新
 */

public class FreshPresenter implements IFreshPresenter{
    /**
     * 请求数据
     */
    @Override
    public void post() {
        //测试
        String url = "api.xinmanhua.net/v2/hotpage?devid=Abe6978500b5004afbab14131d7139c1b&userid=0&xid=&iver=v2&net=1&telecomvendor=1&mobilevendor=smartisan|YQ601&appver=2.1.3&osver=android4.4.2&origin=bdx&tm=1487238023";
        RequestParams params = new RequestParams(url);
        x.http().post(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.e("sdas",result+"111111111");
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
    }
}
