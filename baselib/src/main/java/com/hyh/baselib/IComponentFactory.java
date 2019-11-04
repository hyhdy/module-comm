package com.hyh.baselib;

import com.hyh.baselib.music.IMusicComponent;
import com.hyh.baselib.video.IVideoComponent;

/**
 * created by curdyhuang on 2019-11-04
 */
public interface IComponentFactory {
    IVideoComponent createVideoComponent();

    IMusicComponent createMusicComponent();
}
