package com.hyh.baselib;

import android.content.Context;

import com.hyh.baselib.music.IMusicComponent;
import com.hyh.baselib.video.IVideoComponent;

import java.lang.reflect.Constructor;

/**
 * created by curdyhuang on 2019-11-04
 * 组件工厂负责组件创建，单例
 */
public class ComponentFactory implements IComponentFactory{
    private IVideoComponent mVideoComponent;
    private IMusicComponent mMusicComponent;


    private ComponentFactory() {
    }

    private static class Holder{
        private static final ComponentFactory sInstance = new ComponentFactory();
    }

    public static ComponentFactory getInstance(){
        return Holder.sInstance;
    }

    @Override
    public synchronized IVideoComponent createVideoComponent() {
        if(mVideoComponent == null){
            try {
                //MusicComponent是music模块的类，通过反射拿到该类
                Class<?> clazz = Class.forName("com.hyh.video.VideoComponent");
                //获取有参构造函数
                Constructor c= clazz.getConstructor(Context.class);
                //通过有参构造创建对象
                mVideoComponent = (IVideoComponent) c.newInstance(MyApplication.getApplication());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return mVideoComponent;
    }

    @Override
    public synchronized IMusicComponent createMusicComponent() {
        if(mMusicComponent == null){
            try {
                //MusicComponent是music模块的类，通过反射拿到该类
                Class<?> clazz = Class.forName("com.hyh.music.MusicComponent");
                //获取有参构造函数
                Constructor c= clazz.getConstructor(Context.class);
                //通过有参构造创建对象
                mMusicComponent = (IMusicComponent) c.newInstance(MyApplication.getApplication());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return mMusicComponent;
    }
}
