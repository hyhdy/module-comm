package com.hyh.video.service;

import android.content.Context;
import android.widget.Toast;

import com.hyh.baselib.video.IShortVideoService;

/**
 * created by curdyhuang on 2019-11-04
 */
public class ShortVideoService implements IShortVideoService {

    private Context mContext;

    public ShortVideoService(Context context) {
        mContext = context;
    }

    @Override
    public void startRecord() {
        Toast.makeText(mContext,"开始录制",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void stopRecord() {
        Toast.makeText(mContext,"结束录制",Toast.LENGTH_SHORT).show();
    }
}
