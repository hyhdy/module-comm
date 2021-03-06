package com.hyh.music;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.hyh.baselib.video.proxy.LiveServiceProxy;
import com.hyh.baselib.video.proxy.ShortVideoServiceProxy;

public class MusicActivity extends AppCompatActivity {
    private LiveServiceProxy mLiveServiceProxy;
    private ShortVideoServiceProxy mShortVideoServiceProxy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        mLiveServiceProxy = new LiveServiceProxy();
        mShortVideoServiceProxy = new ShortVideoServiceProxy();

        findViewById(R.id.tv_start_live).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLiveServiceProxy.enterLive();
            }
        });

        findViewById(R.id.tv_stop_live).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLiveServiceProxy.leaveLive();
            }
        });

        findViewById(R.id.tv_start_record).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mShortVideoServiceProxy.startRecord();
            }
        });

        findViewById(R.id.tv_stop_record).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mShortVideoServiceProxy.stopRecord();
            }
        });
    }
}
