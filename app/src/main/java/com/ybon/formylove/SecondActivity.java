package com.ybon.formylove;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

import com.gjiazhe.panoramaimageview.GyroscopeObserver;
import com.gjiazhe.panoramaimageview.PanoramaImageView;
import com.ybon.formylove.checks.CookieThumperSample;
import com.ybon.formylove.heart.HeartView;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import su.levenetc.android.textsurface.TextSurface;
import tyrantgit.widget.HeartLayout;

public class SecondActivity extends AppCompatActivity {

    private GyroscopeObserver gyroscopeObserver;

    private Random mRandom = new Random();
    private Timer  mTimer  = new Timer();
    private HeartLayout mHeartLayout;
    private HeartLayout mHeartLayout1;

    HeartView heartView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextSurface textSurface = (TextSurface) findViewById(R.id.text_surface);
        heartView = (HeartView) findViewById(R.id.heart_view);
        gyroscopeObserver = new GyroscopeObserver();
        // Set the maximum radian the device should rotate to show image's bounds.
        // It should be set between 0 and π/2.
        // The default value is π/9.
        gyroscopeObserver.setMaxRotateRadian(Math.PI/9);

        PanoramaImageView panoramaImageView = (PanoramaImageView) findViewById(R.id.panorama_image_view);
        // Set GyroscopeObserver for PanoramaImageView.
        panoramaImageView.setGyroscopeObserver(gyroscopeObserver);

        CookieThumperSample.play1(textSurface, getAssets());


        mHeartLayout = (HeartLayout) findViewById(R.id.heart_layout);
        mHeartLayout1 = (HeartLayout) findViewById(R.id.heart_layout1);
        mTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                mHeartLayout.post(new Runnable() {
                    @Override
                    public void run() {
                        mHeartLayout.addHeart(randomColor());
                        mHeartLayout1.addHeart(randomColor());
                    }
                });
            }
        }, 500, 200);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        heartView.clearAnimation();
        heartView.reDraw();
        return super.onTouchEvent(event);
    }
    @Override
    protected void onResume() {
        super.onResume();
        // Register GyroscopeObserver.
        gyroscopeObserver.register(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Unregister GyroscopeObserver.
        gyroscopeObserver.unregister();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mTimer.cancel();
    }

    private int randomColor() {
        return Color.rgb(mRandom.nextInt(255), mRandom.nextInt(255), mRandom.nextInt(255));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        setResult(RESULT_OK);
        finish();
    }
}