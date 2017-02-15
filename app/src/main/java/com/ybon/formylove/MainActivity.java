package com.ybon.formylove;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

import com.jetradarmobile.snowfall.SnowfallView;
import com.ybon.formylove.checks.CookieThumperSample;
import com.ybon.formylove.widget.ItemView;

import java.io.IOException;

import su.levenetc.android.textsurface.TextSurface;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity11111";
    private TextSurface  textSurface;
    private SnowfallView mSnowfallView;
    private MediaPlayer  myMediaPlayer;//实例化控制手机播放器的媒体播放器类
    private ItemView     mItemView;
    private Context      mContext;
    private boolean isBack = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = MainActivity.this;
        playSounds();
        mItemView = (ItemView) findViewById(R.id.item_view);

        mSnowfallView = (SnowfallView) findViewById(R.id.snowfall_view);
        mSnowfallView.setVisibility(View.GONE);
        textSurface = (TextSurface) findViewById(R.id.text_surface);

        textSurface.postDelayed(new Runnable() {
            @Override
            public void run() {
                show();
            }
        }, 61000);
    }

    //播放声音文件
    private void playSounds() {
        try {
            AssetFileDescriptor file = getAssets().openFd("sounds/5.mp3");
            myMediaPlayer = new MediaPlayer();
//            mPlayer.setDataSource(file.getFileDescriptor());
            myMediaPlayer.setDataSource(file.getFileDescriptor(), file.getStartOffset(),
                    file.getLength());

            myMediaPlayer.prepare();
            myMediaPlayer.seekTo(3);
            myMediaPlayer.start();
            myMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    startActivityForResult(new Intent(mContext, SecondActivity.class), 1);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
            Log.d("playSounds", "playSounds: " + e.getMessage());
        }
    }

    private void show() {
        mSnowfallView.setVisibility(View.VISIBLE);
        mItemView.setVisibility(View.GONE);
        textSurface.setVisibility(View.VISIBLE);
        textSurface.reset();
        CookieThumperSample.play(textSurface, getAssets());
//		AlignSample.play(textSurface);
//		ColorSample.play(textSurface);
//		ScaleTextSample.run(textSurface);//不好
//		ShapeRevealLoopSample.play(textSurface);
//		ShapeRevealSample.play(textSurface);
//		SlideSample.play(textSurface);
//		SurfaceScaleSample.play(textSurface);
//		SurfaceTransSample.play(textSurface);
    }

//    @Override
//    protected void onPause() {
//        Log.d(TAG, "onPause: 走了吗?");
//        super.onPause();
//        if (isBack){
//
//        }
//        myMediaPlayer.pause();
//    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        mItemView.getRoll3DView().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                mItemView.getRoll3DView().toNext();
//            }
//        },3000);
//        myMediaPlayer.start();
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        myMediaPlayer.start();
//    }


//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        myMediaPlayer.stop();
//        myMediaPlayer.release();
//        this.finish();
//    }

    //    当返回时结束音乐并释放音乐对象
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            isBack = true;
            myMediaPlayer.stop();
            myMediaPlayer.release();
            setResult(RESULT_OK);
            this.finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            setResult(RESULT_OK);
            finish();
        }
    }
}
