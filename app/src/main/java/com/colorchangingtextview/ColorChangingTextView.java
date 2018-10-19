package com.colorchangingtextview;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;

/**
 * Created by appinventiv-pc on 19/10/18.
 */

public class ColorChangingTextView extends android.support.v7.widget.AppCompatTextView {

    private Context context;
    
    public ColorChangingTextView(Context context) {
        super(context);
        this.context=context;
    }

    public ColorChangingTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public ColorChangingTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }

    //Change your colors from here
    public void animateIt(int [] colorsArray){
        ObjectAnimator a = ObjectAnimator.ofInt(this, "textColor",
                colorsArray);
        a.setInterpolator(new LinearInterpolator());
        a.setDuration(2000);
        a.setRepeatCount(ValueAnimator.INFINITE);
        a.setRepeatMode(ValueAnimator.REVERSE);
        a.setEvaluator(new ArgbEvaluator());
        AnimatorSet t = new AnimatorSet();
        t.play(a);
        t.start();
    }



}
