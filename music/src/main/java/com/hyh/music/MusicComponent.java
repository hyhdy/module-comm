package com.hyh.music;

import android.content.Context;

import com.hyh.baselib.music.IListenerService;
import com.hyh.baselib.music.IMusicComponent;
import com.hyh.baselib.music.ISingService;
import com.hyh.music.service.ListenerService;
import com.hyh.music.service.SingService;

/**
 * created by curdyhuang on 2019-11-04
 */
public class MusicComponent implements IMusicComponent {
    private Context mContext;
    private ListenerService mListenerService;
    private SingService mSingService;

    public MusicComponent(Context context) {
        mContext = context;
    }

    @Override
    public synchronized IListenerService getListenerService() {
        if(mListenerService == null){
            mListenerService = new ListenerService(mContext);
        }
        return mListenerService;
    }

    @Override
    public ISingService getSingService() {
        if(mSingService == null){
            mSingService = new SingService(mContext);
        }
        return mSingService;
    }
}
