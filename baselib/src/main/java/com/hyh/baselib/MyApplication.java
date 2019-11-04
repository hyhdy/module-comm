package com.hyh.baselib;

import android.app.Application;

/**
 * created by curdyhuang on 2019-11-04
 */
public class MyApplication extends Application {
    private static MyApplication mApplication;

    public static Application getApplication(){
        return mApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
    }
}
