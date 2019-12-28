package com.hyh.baselib.music.adapter;

import com.hyh.baselib.ComponentFactory;
import com.hyh.baselib.music.ISingService;

/**
 * created by curdyhuang on 2019-11-04
 */
public class SingServiceAdapter implements ISingService {
    private ISingService mSingService;

    public SingServiceAdapter() {
        mSingService = ComponentFactory.getInstance().createMusicComponent().getSingService();
    }

    @Override
    public void startSing() {
        mSingService.startSing();
    }

    @Override
    public void stopSing() {
        mSingService.stopSing();
    }
}
