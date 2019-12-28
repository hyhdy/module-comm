package com.hyh.baselib.video.adapter;

import com.hyh.baselib.ComponentFactory;
import com.hyh.baselib.video.ILiveService;

/**
 * created by curdyhuang on 2019-11-04
 * 直播服务代理类，通过代理接口访问视频模块的直播服务
 */
public class LiveServiceAdapter implements ILiveService {
    private ILiveService mLiveService;

    public LiveServiceAdapter() {
        mLiveService = ComponentFactory.getInstance().createVideoComponent().getLiveService();
    }

    @Override
    public void enterLive() {
        mLiveService.enterLive();
    }

    @Override
    public void leaveLive() {
        mLiveService.leaveLive();
    }
}
