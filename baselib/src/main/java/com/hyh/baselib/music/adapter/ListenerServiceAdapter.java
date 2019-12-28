package com.hyh.baselib.music.adapter;

import com.hyh.baselib.ComponentFactory;
import com.hyh.baselib.music.IListenerService;

/**
 * created by curdyhuang on 2019-11-04
 */
public class ListenerServiceAdapter implements IListenerService {
    private IListenerService mListenerService;

    public ListenerServiceAdapter() {
        mListenerService = ComponentFactory.getInstance().createMusicComponent().getListenerService();
    }

    @Override
    public void playMusic() {
        mListenerService.playMusic();
    }

    @Override
    public void pauseMusic() {
        mListenerService.pauseMusic();
    }
}
