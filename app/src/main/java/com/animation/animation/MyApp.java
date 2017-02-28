package com.animation.animation;

import android.app.Application;

import org.xutils.x;

/**
 * Created by luojurong on 2017/2/18.
 */

public class MyApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        x.Ext.init(this);

        //x.Ext.setDebug(BuildConfig.DEBUG);
    }
}
