package com.ybon.formylove.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chenzy.widget.Roll3DView;
import com.ybon.formylove.R;


/**
 * Created by zhangyu on 2017/1/19.
 */

public class ItemView extends LinearLayout {
    private Context context;

    private Roll3DView     roll3DView;
    private Button         toLeft;
    private Button         toRight;
    private Button         toUp;
    private Button         toDown;
    private TextView       titleTv;
    private BitmapDrawable bgDrawable1, bgDrawable2, bgDrawable3, bgDrawable4, bgDrawable5,
            bgDrawable6, bgDrawable7, bgDrawable8, bgDrawable9, bgDrawable10, bgDrawable11, bgDrawable12,
            bgDrawable13, bgDrawable14, bgDrawable15, bgDrawable16, bgDrawable17, bgDrawable18,
            bgDrawable19, bgDrawable20, bgDrawable21, bgDrawable22, bgDrawable23, bgDrawable24,
            bgDrawable25, bgDrawable26, bgDrawable27, bgDrawable28, bgDrawable29, bgDrawable30,
            bgDrawable31, bgDrawable32, bgDrawable33, bgDrawable34, bgDrawable35, bgDrawable36,
            bgDrawable37, bgDrawable38;

    public ItemView(Context context) {
        super(context);
        init(context);
    }

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        this.context = context;
        View.inflate(context, R.layout.demo_item, this);


        roll3DView = (Roll3DView) findViewById(R.id.three_d_view);

//        bgDrawable1 = (BitmapDrawable) getResources().getDrawable(R.drawable.m1);
//        bgDrawable2 = (BitmapDrawable) getResources().getDrawable(R.drawable.m2);
//        bgDrawable10 = (BitmapDrawable) getResources().getDrawable(R.drawable.m3);
//        bgDrawable11 = (BitmapDrawable) getResources().getDrawable(R.drawable.m4);
//        bgDrawable14 = (BitmapDrawable) getResources().getDrawable(R.drawable.m5);
//        bgDrawable15 = (BitmapDrawable) getResources().getDrawable(R.drawable.m6);
        bgDrawable1 = (BitmapDrawable) getResources().getDrawable(R.drawable.img1);
        bgDrawable2 = (BitmapDrawable) getResources().getDrawable(R.drawable.img2);
        bgDrawable10 = (BitmapDrawable) getResources().getDrawable(R.drawable.img10);
        bgDrawable11 = (BitmapDrawable) getResources().getDrawable(R.drawable.img11);
        bgDrawable14 = (BitmapDrawable) getResources().getDrawable(R.drawable.img14);
        bgDrawable15 = (BitmapDrawable) getResources().getDrawable(R.drawable.img15);
        bgDrawable16 = (BitmapDrawable) getResources().getDrawable(R.drawable.img16);
        bgDrawable17 = (BitmapDrawable) getResources().getDrawable(R.drawable.img17);
        bgDrawable18 = (BitmapDrawable) getResources().getDrawable(R.drawable.img18);
        bgDrawable19 = (BitmapDrawable) getResources().getDrawable(R.drawable.img19);
        bgDrawable20 = (BitmapDrawable) getResources().getDrawable(R.drawable.img20);
        bgDrawable23 = (BitmapDrawable) getResources().getDrawable(R.drawable.img23);
        bgDrawable24 = (BitmapDrawable) getResources().getDrawable(R.drawable.img24);
        bgDrawable25 = (BitmapDrawable) getResources().getDrawable(R.drawable.img25);
        bgDrawable28 = (BitmapDrawable) getResources().getDrawable(R.drawable.img28);
        bgDrawable29 = (BitmapDrawable) getResources().getDrawable(R.drawable.img29);
        bgDrawable32 = (BitmapDrawable) getResources().getDrawable(R.drawable.img32);
        bgDrawable34 = (BitmapDrawable) getResources().getDrawable(R.drawable.img34);
        bgDrawable35 = (BitmapDrawable) getResources().getDrawable(R.drawable.img35);
        bgDrawable36 = (BitmapDrawable) getResources().getDrawable(R.drawable.img36);


        Bitmap bitmap1 = bgDrawable1.getBitmap();
        Bitmap bitmap2 = bgDrawable2.getBitmap();
        Bitmap bitmap10 = bgDrawable10.getBitmap();
        Bitmap bitmap11 = bgDrawable11.getBitmap();
        Bitmap bitmap14 = bgDrawable14.getBitmap();
        Bitmap bitmap15 = bgDrawable15.getBitmap();
        Bitmap bitmap16 = bgDrawable16.getBitmap();
        Bitmap bitmap17 = bgDrawable17.getBitmap();
        Bitmap bitmap18 = bgDrawable18.getBitmap();
        Bitmap bitmap19 = bgDrawable19.getBitmap();
        Bitmap bitmap20 = bgDrawable20.getBitmap();
        Bitmap bitmap23 = bgDrawable23.getBitmap();
        Bitmap bitmap24 = bgDrawable24.getBitmap();
        Bitmap bitmap25 = bgDrawable25.getBitmap();
        Bitmap bitmap28 = bgDrawable28.getBitmap();
        Bitmap bitmap29 = bgDrawable29.getBitmap();
        Bitmap bitmap32 = bgDrawable32.getBitmap();
        Bitmap bitmap34 = bgDrawable34.getBitmap();
        Bitmap bitmap35 = bgDrawable35.getBitmap();
        Bitmap bitmap36 = bgDrawable36.getBitmap();

        roll3DView.addImageBitmap(bitmap1);
        roll3DView.addImageBitmap(bitmap2);
        roll3DView.addImageBitmap(bitmap10);
        roll3DView.addImageBitmap(bitmap11);
        roll3DView.addImageBitmap(bitmap14);
        roll3DView.addImageBitmap(bitmap15);
        roll3DView.addImageBitmap(bitmap16);
        roll3DView.addImageBitmap(bitmap17);
        roll3DView.addImageBitmap(bitmap18);
        roll3DView.addImageBitmap(bitmap19);
        roll3DView.addImageBitmap(bitmap20);
        roll3DView.addImageBitmap(bitmap23);
        roll3DView.addImageBitmap(bitmap24);
        roll3DView.addImageBitmap(bitmap25);
        roll3DView.addImageBitmap(bitmap28);
        roll3DView.addImageBitmap(bitmap29);
        roll3DView.addImageBitmap(bitmap32);
        roll3DView.addImageBitmap(bitmap34);
        roll3DView.addImageBitmap(bitmap35);
        roll3DView.addImageBitmap(bitmap36);

        roll3DView.setRollMode(Roll3DView.RollMode.Whole3D);
        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollDirection(0);
                roll3DView.toNext();
            }
        }, 4000);
        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollDirection(0);
                roll3DView.toNext();
            }
        }, 7000);
        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollDirection(0);
                roll3DView.toNext();
            }
        }, 10000);
        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollDirection(1);
                roll3DView.toNext();
            }
        }, 13000);

        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollDirection(1);
                roll3DView.toNext();
            }
        }, 16000);
        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollDirection(1);
                roll3DView.toNext();
//                roll3DView.setRollMode(Roll3DView.RollMode.SepartConbine);
//                roll3DView.setPartNumber(3);
            }
        }, 19000);
        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollMode(Roll3DView.RollMode.SepartConbine);
                roll3DView.setPartNumber(3);
            }
        }, 20000);
        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollDirection(0);
                roll3DView.toNext();
            }
        }, 22000);
        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollDirection(0);
                roll3DView.toNext();
            }
        }, 25000);
        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollDirection(0);
                roll3DView.toNext();
            }
        }, 28000);
        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollDirection(1);
                roll3DView.toNext();
            }
        }, 31000);
        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollDirection(1);
                roll3DView.toNext();
//                roll3DView.setRollMode(Roll3DView.RollMode.Jalousie);
//                roll3DView.setPartNumber(5);
            }
        }, 34000);
        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollMode(Roll3DView.RollMode.Jalousie);
                roll3DView.setPartNumber(5);
            }
        }, 35000);
        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollDirection(1);
                roll3DView.toNext();
            }
        }, 37000);
        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollDirection(0);
                roll3DView.toNext();
            }
        }, 40000);
        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollDirection(0);
                roll3DView.toNext();
            }
        }, 43000);
        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollDirection(0);
                roll3DView.toNext();
            }
        }, 46000);
        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollDirection(1);
                roll3DView.toNext();
//                roll3DView.setRollMode(Roll3DView.RollMode.RollInTurn);
//                roll3DView.setPartNumber(9);
            }
        }, 49000);
        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollMode(Roll3DView.RollMode.RollInTurn);
                roll3DView.setPartNumber(9);
            }
        }, 50000);

        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollDirection(1);
                roll3DView.toNext();
            }
        }, 52000);
        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollDirection(1);
                roll3DView.toNext();
            }
        }, 55000);
        roll3DView.postDelayed(new Runnable() {
            @Override
            public void run() {
                roll3DView.setRollDirection(0);
                roll3DView.toNext();
            }
        }, 58000);
//        roll3DView.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                roll3DView.setRollDirection(0);
//                roll3DView.toNext();
//            }
//        }, 58000);
//        roll3DView.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                roll3DView.setRollDirection(0);
//                roll3DView.toNext();
//            }
//        }, 61000);
    }

    public Roll3DView getRoll3DView() {
        return roll3DView;
    }

    public void setTitleText(String titleText) {
        titleTv.setText(titleText);
    }
}
