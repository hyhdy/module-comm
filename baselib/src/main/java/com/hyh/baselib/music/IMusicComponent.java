package com.hyh.baselib.music;

/**
 * created by curdyhuang on 2019-11-04
 * 音乐模块组件
 */
public interface IMusicComponent {
    /**
     * 获取听歌服务
     * @return
     */
    IListenerService getListenerService();

    /**
     * 获取唱歌服务
     * @return
     */
    ISingService getSingService();
}
