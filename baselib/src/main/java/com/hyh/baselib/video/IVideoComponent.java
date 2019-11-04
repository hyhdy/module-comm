package com.hyh.baselib.video;

/**
 * created by curdyhuang on 2019-11-04
 * 视频模块组件
 */
public interface IVideoComponent {
    /**
     * 获取直播服务
     * @return
     */
    ILiveService getLiveService();

    /**
     * 获取短视频服务
     * @return
     */
    IShortVideoService getShortVideoService();
}
