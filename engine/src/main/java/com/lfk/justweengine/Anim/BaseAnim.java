package com.lfk.justweengine.Anim;

import android.graphics.Point;
import android.renderscript.Float2;

/**
 * 动画基类
 *
 * @author liufengkai
 *         Created by liufengkai on 15/11/28.
 */
public class BaseAnim {
    // Is it running ?
    public boolean animating;

    // init
    public BaseAnim() {
        animating = false;
    }

    public int adjustAlpha(int ori) {
        return ori;
    }

    public int adjustFrame(int ori) {
        return ori;
    }

    public Float2 adjustScale(Float2 ori) {
        return ori;
    }

    public float adjustRotation(float ori) {
        return ori;
    }

    public Point adjustPoint(Point ori) {
        return ori;
    }
}
