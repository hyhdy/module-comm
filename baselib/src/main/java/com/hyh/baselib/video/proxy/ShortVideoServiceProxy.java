package com.hyh.baselib.video.proxy;

import com.hyh.baselib.ComponentFactory;
import com.hyh.baselib.video.IShortVideoService;

/**
 * created by curdyhuang on 2019-11-04
 * 短视频服务代理类，通过代理接口访问视频模块的短视频服务
 */
public class ShortVideoServiceProxy implements IShortVideoService {
    private IShortVideoService mShortVideoService;

    public ShortVideoServiceProxy() {
        mShortVideoService = ComponentFactory.getInstance().createVideoComponent().getShortVideoService();
    }

    @Override
    public void startRecord() {
        mShortVideoService.startRecord();
    }

    @Override
    public void stopRecord() {
        mShortVideoService.stopRecord();
    }
}
