package com.hyh.music.service;

import android.content.Context;
import android.widget.Toast;

import com.hyh.baselib.music.ISingService;

/**
 * created by curdyhuang on 2019-11-04
 * 对外提供唱歌服务
 */
public class SingService implements ISingService {
    private Context mContext;

    public SingService(Context context) {
        mContext = context;
    }

    @Override
    public void startSing() {
        Toast.makeText(mContext,"开始唱歌",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void stopSing() {
        Toast.makeText(mContext,"停止唱歌",Toast.LENGTH_SHORT).show();
    }
}
