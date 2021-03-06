/*
 * Copyright (c) 2014. Marshal Chen.
 */

package com.fss.common.uiModule.niftymodaldialogeffects.effects;

import android.view.View;

import com.fss.common.uiModule.nineoldandroids.animation.ObjectAnimator;

/**
 * Created by lee on 2014/7/31.
 */
public class NewsPaper extends BaseEffects{

    @Override
    protected void setupAnimation(View view) {
        getAnimatorSet().playTogether(
                ObjectAnimator.ofFloat(view, "rotation", 1080,720,360,0).setDuration(DURATION),
                ObjectAnimator.ofFloat(view, "alpha", 0, 1).setDuration(DURATION*3/2),
                ObjectAnimator.ofFloat(view, "scaleX", 0.1f, 0.5f, 1).setDuration(DURATION),
                ObjectAnimator.ofFloat(view,"scaleY",0.1f,0.5f,1).setDuration(DURATION)

        );
    }
}
