package com.hyh.video;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.hyh.baselib.music.adapter.ListenerServiceAdapter;
import com.hyh.baselib.music.adapter.SingServiceAdapter;

public class VideoActivity extends AppCompatActivity {
    private ListenerServiceAdapter mListenerServiceProxy;
    private SingServiceAdapter mSingServiceProxy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        mListenerServiceProxy = new ListenerServiceAdapter();
        mSingServiceProxy = new SingServiceAdapter();

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
