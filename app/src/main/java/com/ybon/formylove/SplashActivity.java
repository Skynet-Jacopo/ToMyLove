package com.ybon.formylove;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.gjiazhe.panoramaimageview.GyroscopeObserver;
import com.gjiazhe.panoramaimageview.PanoramaImageView;
import com.hrules.trendtextview.TrendTextView;
import com.spark.submitbutton.SubmitButton;

public class SplashActivity extends AppCompatActivity {

    private GyroscopeObserver gyroscopeObserver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        AssetManager assetManager = getAssets();
        Typeface     typeface     = Typeface.createFromAsset(assetManager, "fonts/STXINGKA.TTF");

        gyroscopeObserver = new GyroscopeObserver();

        PanoramaImageView panoramaImageView = (PanoramaImageView) findViewById(R.id.panorama_image_view);
        panoramaImageView.setGyroscopeObserver(gyroscopeObserver);


        TrendTextView trendTextView = (TrendTextView) findViewById(R.id.trendTextView);
        trendTextView.setDelay(200);
        trendTextView.setTypeface(typeface);
        trendTextView.animateText("菇凉,情人节到了,作为一个程序员,这似乎是我想到的第一种能送给你的礼物,请笑纳!(友情提示:未能考虑实用性,比较耗内存," +
                "点击按钮后稍有延迟,粗陋之作,博尔一笑)");


        final SubmitButton submitButton = (SubmitButton) findViewById(R.id.submit_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitButton.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivityForResult(new Intent(SplashActivity.this, MainActivity.class)
                                , 1);
                    }
                }, 3500);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        gyroscopeObserver.register(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        gyroscopeObserver.unregister();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            finish();
        }
    }
}
