package com.hyh.video;

import android.content.Context;

import com.hyh.baselib.music.IListenerService;
import com.hyh.baselib.music.ISingService;
import com.hyh.baselib.video.ILiveService;
import com.hyh.baselib.video.IShortVideoService;
import com.hyh.baselib.video.IVideoComponent;
import com.hyh.video.service.LiveService;
import com.hyh.video.service.ShortVideoService;

/**
 * created by curdyhuang on 2019-11-04
 */
public class VideoComponent implements IVideoComponent {
    private Context mContext;
    private ILiveService mLiveService;
    private IShortVideoService mShortVideoService;

    public VideoComponent(Context context) {
        mContext = context;
    }

    @Override
    public synchronized ILiveService getLiveService() {
        if(mLiveService == null){
            mLiveService = new LiveService(mContext);
        }
        return mLiveService;
    }

    @Override
    public synchronized IShortVideoService getShortVideoService() {
        if(mShortVideoService == null){
            mShortVideoService = new ShortVideoService(mContext);
        }
        return mShortVideoService;
    }
}
