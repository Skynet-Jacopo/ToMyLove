package com.ybon.formylove.checks;

import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;

import su.levenetc.android.textsurface.Text;
import su.levenetc.android.textsurface.TextBuilder;
import su.levenetc.android.textsurface.TextSurface;
import su.levenetc.android.textsurface.animations.Alpha;
import su.levenetc.android.textsurface.animations.ChangeColor;
import su.levenetc.android.textsurface.animations.Circle;
import su.levenetc.android.textsurface.animations.Delay;
import su.levenetc.android.textsurface.animations.Loop;
import su.levenetc.android.textsurface.animations.Parallel;
import su.levenetc.android.textsurface.animations.Rotate3D;
import su.levenetc.android.textsurface.animations.Sequential;
import su.levenetc.android.textsurface.animations.ShapeReveal;
import su.levenetc.android.textsurface.animations.SideCut;
import su.levenetc.android.textsurface.animations.Slide;
import su.levenetc.android.textsurface.animations.TransSurface;
import su.levenetc.android.textsurface.contants.Align;
import su.levenetc.android.textsurface.contants.Direction;
import su.levenetc.android.textsurface.contants.Pivot;
import su.levenetc.android.textsurface.contants.Side;

/**
 * Created by Eugene Levenetc.
 */
public class CookieThumperSample {

    public static void play(TextSurface textSurface, AssetManager assetManager) {

        final Typeface robotoBlack = Typeface.createFromAsset(assetManager, "fonts/STCAIYUN.TTF");
        Paint          paint       = new Paint();
        paint.setAntiAlias(true);
        paint.setTypeface(robotoBlack);


        final Typeface robotoBlack1 = Typeface.createFromAsset(assetManager, "fonts/STXINGKA.TTF");
        Paint          paint1       = new Paint();
        paint1.setAntiAlias(true);
        paint1.setTypeface(robotoBlack1);

        final Typeface robotoBlack2 = Typeface.createFromAsset(assetManager, "fonts/new.TTF");
        Paint          paint2       = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTypeface(robotoBlack2);

        Text textA = TextBuilder.create("水平有限")
                .setPaint(paint1)
                .setSize(50)
                .setAlpha(0)
                .setColor(Color.GREEN)
                .setPosition(Align.SURFACE_CENTER).build();
        Text textB = TextBuilder.create("小小心意")
                .setPaint(paint1)
                .setSize(50)
                .setAlpha(0)
                .setColor(Color.GREEN)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textA).build();
        Text textC = TextBuilder.create("做工粗糙")
                .setPaint(paint1)
                .setSize(50)
                .setAlpha(0)
                .setColor(Color.GREEN)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textB).build();
        Text textD = TextBuilder.create("切莫见笑")
                .setPaint(paint1)
                .setSize(50)
                .setAlpha(0)
                .setColor(Color.GREEN)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textC).build();

        Text text1 = TextBuilder
                .create("菇凉")
                .setPaint(paint)
                .setSize(64)
                .setAlpha(0)
                .setColor(Color.WHITE)
//                .setPosition(Align.SURFACE_CENTER).build();
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textD).build();

        Text text2 = TextBuilder
                .create("上面的这些照片")
                .setPaint(paint)
                .setSize(44)
                .setAlpha(0)
                .setPadding(0, 40, 0, 0)
                .setColor(Color.RED)
                .setPosition(Align.BOTTOM_OF, text1).build();

        Text text3 = TextBuilder
                .create("记录了你和我")
                .setPaint(paint)
                .setSize(44)
                .setAlpha(0)
                .setColor(Color.RED)
                .setPosition(Align.RIGHT_OF, text2).build();

        Text text4 = TextBuilder
                .create("从相识")
                .setPaint(paint)
                .setSize(50)
                .setAlpha(0)
                .setColor(Color.RED)
                .setPosition(Align.BOTTOM_OF, text3).build();

        Text text5 = TextBuilder
                .create("到相恋")
                .setPaint(paint)
                .setSize(50)
                .setAlpha(0)
                .setColor(Color.RED)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, text4).build();

        Text tex6 = TextBuilder
                .create("到相知")
                .setPaint(paint)
                .setSize(50)
                .setAlpha(0)
                .setColor(Color.RED)
                .setPosition(Align.BOTTOM_OF, text5).build();

        Text text7 = TextBuilder
                .create("的整个过程")
                .setPaint(paint)
                .setSize(50)
                .setAlpha(0)
                .setColor(Color.WHITE)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, tex6).build();

        Text text8 = TextBuilder
                .create("期间有过争吵")
                .setPaint(paint)
                .setSize(44)
                .setAlpha(0)
                .setColor(Color.YELLOW)
                .setPadding(0, 40, 0, 0)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, text7).build();

        Text text9 = TextBuilder
                .create("有过摩擦")
                .setPaint(paint)
                .setSize(44)
                .setAlpha(0)
                .setColor(Color.YELLOW)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, text8).build();
        Text text10 = TextBuilder
                .create("有过挫折")
                .setPaint(paint)
                .setSize(44)
                .setAlpha(0)
                .setColor(Color.YELLOW)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, text9).build();

        Text text11 = TextBuilder
                .create("但更多的是")
                .setPaint(paint)
                .setSize(44)
                .setAlpha(0)
                .setPadding(0, 60, 0, 0)
                .setColor(Color.WHITE)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, text10).build();
        Text text12 = TextBuilder
                .create("温馨")
                .setPaint(paint1)
                .setSize(70)
                .setAlpha(0)
                .setColor(Color.MAGENTA)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, text11).build();
        Text text13 = TextBuilder
                .create("幸福")
                .setPaint(paint1)
                .setSize(70)
                .setAlpha(0)
                .setColor(Color.MAGENTA)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, text12).build();
        Text text14 = TextBuilder
                .create("快乐")
                .setPaint(paint1)
                .setSize(70)
                .setAlpha(0)
                .setColor(Color.MAGENTA)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, text13).build();
        Text text15 = TextBuilder
                .create("感谢有你相伴")
                .setPaint(paint)
                .setSize(44)
                .setAlpha(0)
                .setPadding(0, 60, 0, 0)
                .setColor(Color.CYAN)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, text14).build();
        Text text16 = TextBuilder
                .create("未来有你更精彩")
                .setPaint(paint)
                .setSize(44)
                .setAlpha(0)
                .setColor(Color.CYAN)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, text15).build();
        Text text17 = TextBuilder
                .create("情人节快乐!")
                .setPaint(paint1)
                .setSize(80)
                .setAlpha(0)
//                .setPadding(0,-80,0,0)
                .setColor(Color.RED)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, text16).build();

        Text text18 = TextBuilder
                .create("I love you")
                .setPaint(paint2)
                .setSize(80)
                .setAlpha(0)
//                .setPadding(0,-80,0,0)
                .setColor(Color.RED)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, text17).build();
        textSurface.play(
                new Sequential(
                        Delay.duration(1500),
                        new Parallel(TransSurface.toCenter(textA, 1500), Rotate3D.showFromSide
                                (textA, 1750, Pivot.LEFT)),
                        Delay.duration(500),
                        new Parallel(TransSurface.toCenter(textB, 1500), Rotate3D.showFromSide
                                (textB, 1750, Pivot.LEFT)),
                        Delay.duration(500),
                        new Parallel(TransSurface.toCenter(textC, 1500), Rotate3D.showFromSide
                                (textC, 1750, Pivot.LEFT)),
                        Delay.duration(500),
                        new Parallel(TransSurface.toCenter(textD, 1500), Rotate3D.showFromSide
                                (textD, 1750, Pivot.LEFT)),
                        Delay.duration(500),
                        new Parallel(
                                ShapeReveal.create(textB, 2500, SideCut.hide(Side.LEFT), true),
                                new Sequential(Delay.duration(1250), ShapeReveal.create(textC,
                                        1500, SideCut.hide(Side.LEFT), true)),
                                new Sequential(Delay.duration(1500), ShapeReveal.create(textD,
                                        1500, SideCut.hide(Side.LEFT), true)),
                                Alpha.hide(textA, 1500)
                        ),
                        Delay.duration(1500),

                        ShapeReveal.create(text1, 750, SideCut.show(Side.LEFT), false),
                        new Parallel(ShapeReveal.create(text1, 600, SideCut.hide(Side.LEFT), false), new Sequential(Delay.duration(300), ShapeReveal.create(text1, 600, SideCut.show(Side.LEFT), false))),
                        Delay.duration(1000),
                        new Parallel(new TransSurface(1000, text2, Pivot.CENTER), ShapeReveal
                                .create(text2, 1300, SideCut.show(Side.LEFT), false)),
                        Delay.duration(1000),
                        new Parallel(new TransSurface(1750, text3, Pivot.CENTER), Slide.showFrom
                                (Side.LEFT, text3, 1750), ChangeColor.to(text3, 1750, Color.WHITE)),
                        Delay.duration(1000),
                        new Parallel(TransSurface.toCenter(text4, 1500), Rotate3D.showFromSide
                                (text4, 1750, Pivot.TOP)),//从相识
                        new Parallel(TransSurface.toCenter(text5, 1500), Slide.showFrom(Side.TOP,
                                text5, 1500)),
                        new Parallel(TransSurface.toCenter(tex6, 1750), Slide.showFrom(Side.LEFT,
                                tex6, 1500)),
                        new Parallel(TransSurface.toCenter(tex6, 1750), Slide.showFrom(Side.RIGHT,
                                text7, 1500)),
                        Delay.duration(1000),
                        new Parallel(
                                new TransSurface(1500, text9, Pivot.CENTER),
                                new Sequential(
//										new Sequential(ShapeReveal.create(text7, 1500, Circle
//												.show(Side.CENTER, Direction.OUT), false)),
                                        new Sequential(ShapeReveal.create(text8, 1500, Circle
                                                .show(Side.CENTER, Direction.OUT), false)),
                                        new Sequential(ShapeReveal.create(text9, 1500, Circle
                                                .show(Side.CENTER, Direction.OUT), false)),
                                        new Sequential(ShapeReveal.create(text10, 1500, Circle
                                                .show(Side.CENTER, Direction.OUT), false))

                                )
                        ),
                        Delay.duration(2500),
                        new Parallel(TransSurface.toCenter(text11, 1750), Slide.showFrom(Side.RIGHT,
                                text11, 1500)),
                        new Parallel(TransSurface.toCenter(text12, 1500), Rotate3D.showFromSide
                                (text12, 1750, Pivot.TOP)),
                        new Parallel(TransSurface.toCenter(text13, 1500), Rotate3D.showFromSide
                                (text13, 1750, Pivot.TOP)),
                        new Parallel(TransSurface.toCenter(text14, 1500), Rotate3D.showFromSide
                                (text14, 1750, Pivot.TOP)),
                        Delay.duration(1000),
                        new Parallel(TransSurface.toCenter(text15, 1750), Slide.showFrom(Side.LEFT,
                                text15, 1500)),
                        new Parallel(TransSurface.toCenter(text16, 1750), Slide.showFrom(Side.LEFT,
                                text16, 1500)),
                        new Parallel(
                                ShapeReveal.create(text14, 2500, SideCut.hide(Side.LEFT), true),
                                new Sequential(Delay.duration(1250), ShapeReveal.create(text15,
                                        1500, SideCut.hide(Side.LEFT), true)),
                                new Sequential(Delay.duration(1500), ShapeReveal.create(text16,
                                        1500, SideCut.hide(Side.LEFT), true)),
                                Alpha.hide(text13, 1500),
                                Alpha.hide(text12, 1500)
                        ),
                        Delay.duration(1500),
                        new Loop(ShapeReveal.create(text17, 1750, SideCut.show(Side.LEFT), false),
                                new Parallel(ShapeReveal.create(text17, 1600, SideCut.hide(Side.LEFT),
                                        false), new Sequential(Delay.duration(700), ShapeReveal.create
                                        (text17, 1600, SideCut.show(Side.LEFT), false))),
                                new Parallel(new TransSurface(1750, text18, Pivot.CENTER), Slide.showFrom
                                        (Side.LEFT, text18, 1750), ChangeColor.to(text18, 1750, Color.YELLOW)))

                )
        );

    }

    public static void play1(TextSurface textSurface, AssetManager assetManager){
        final Typeface robotoBlack = Typeface.createFromAsset(assetManager, "fonts/STCAIYUN.TTF");
        Paint          paint       = new Paint();
        paint.setAntiAlias(true);
        paint.setTypeface(robotoBlack);


        final Typeface robotoBlack1 = Typeface.createFromAsset(assetManager, "fonts/STXINGKA.TTF");
        Paint          paint1       = new Paint();
        paint1.setAntiAlias(true);
        paint1.setTypeface(robotoBlack1);

        final Typeface robotoBlack2 = Typeface.createFromAsset(assetManager, "fonts/new.TTF");
        Paint          paint2       = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTypeface(robotoBlack2);

        Text textA = TextBuilder.create("哇哦")
                .setPaint(paint)
                .setSize(66)
                .setAlpha(0)
                .setColor(Color.YELLOW)
                .setPosition(Align.SURFACE_CENTER).build();
        Text textB = TextBuilder.create("你居然听完了")
                .setPaint(paint1)
                .setSize(50)
                .setAlpha(0)
                .setColor(Color.GREEN)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textA).build();
        Text textC = TextBuilder.create("菇凉")
                .setPaint(paint1)
                .setSize(50)
                .setAlpha(0)
                .setColor(Color.GREEN)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textB).build();
        Text textD = TextBuilder.create("我爱你!")
                .setPaint(paint1)
                .setSize(50)
                .setAlpha(0)
                .setColor(Color.GREEN)
                .setPosition(Align.BOTTOM_OF | Align.CENTER_OF, textC).build();
        textSurface.play(
                new Sequential(
                        Delay.duration(1500),
                        new Parallel(TransSurface.toCenter(textA, 1500), Rotate3D.showFromSide
                                (textA, 1750, Pivot.LEFT)),
                        Delay.duration(500),
                        new Parallel(TransSurface.toCenter(textB, 1500), Rotate3D.showFromSide
                                (textB, 1750, Pivot.LEFT)),
                        new Parallel(
                                ShapeReveal.create(textA, 2500, SideCut.hide(Side.LEFT), true),
                                new Sequential(Delay.duration(1250), ShapeReveal.create(textB,
                                        1500, SideCut.hide(Side.LEFT), true))
                        ),
                        new Parallel(TransSurface.toCenter(textC, 1500), Rotate3D.showFromSide
                                (textC, 1750, Pivot.RIGHT)),
                        new Parallel(TransSurface.toCenter(textD, 1500), Rotate3D.showFromSide
                                (textD, 1750, Pivot.RIGHT))

                )
        );

    }
}
