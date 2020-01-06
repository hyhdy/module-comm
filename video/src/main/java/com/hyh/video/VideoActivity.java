package com.hyh.video;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.hyh.baselib.music.proxy.ListenerServiceProxy;
import com.hyh.baselib.music.proxy.SingServiceProxy;

public class VideoActivity extends AppCompatActivity {
    private ListenerServiceProxy mListenerServiceProxy;
    private SingServiceProxy mSingServiceProxy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        mListenerServiceProxy = new ListenerServiceProxy();
        mSingServiceProxy = new SingServiceProxy();

        findViewById(R.id.tv_start_listen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListenerServiceProxy.playMusic();
            }
        });

        findViewById(R.id.tv_stop_listen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListenerServiceProxy.pauseMusic();
            }
        });

        findViewById(R.id.tv_start_sing).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSingServiceProxy.startSing();
            }
        });

        findViewById(R.id.tv_stop_sing).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSingServiceProxy.stopSing();
            }
        });
    }
}
