package com.hyh.video.service;

import android.content.Context;
import android.widget.Toast;

import com.hyh.baselib.video.ILiveService;

/**
 * created by curdyhuang on 2019-11-04
 */
public class LiveService implements ILiveService {

    private Context mContext;

    public LiveService(Context context) {
        mContext = context;
    }

    @Override
    public void enterLive() {
        Toast.makeText(mContext,"开始直播",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void leaveLive() {
        Toast.makeText(mContext,"结束直播",Toast.LENGTH_SHORT).show();
    }
}
