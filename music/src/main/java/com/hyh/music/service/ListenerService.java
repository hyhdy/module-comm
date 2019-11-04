package com.hyh.music.service;

import android.content.Context;
import android.widget.Toast;

import com.hyh.baselib.music.IListenerService;

/**
 * created by curdyhuang on 2019-11-04
 * 对外提供听歌服务
 */
public class ListenerService implements IListenerService {
    private Context mContext;

    public ListenerService(Context context) {
        mContext = context;
    }

    @Override
    public void playMusic() {
        Toast.makeText(mContext,"开始播歌",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void pauseMusic() {
        Toast.makeText(mContext,"暂停播歌",Toast.LENGTH_SHORT).show();
    }
}
