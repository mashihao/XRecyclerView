package com.jcodecraeer.xrecyclerview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by jianghejie on 15/11/22.
 */
abstract class BaseRefreshHeader extends LinearLayout {

    public static class RefreshState {
        public static final int NORMAL = 0;
        public static final int RELEASE_TO_REFRESH = 1;
        public static final int REFRESHING = 2;
        public static final int DONE = 3;
    }

    public BaseRefreshHeader(Context context) {
        super(context);
    }

    public BaseRefreshHeader(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseRefreshHeader(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    /*
     * 0 不刷新
     * 1 释放刷新
     * 2 正在刷新
     * 3 刷新完成
     * */

    abstract void onMove(float delta);

    abstract boolean releaseAction();

    abstract void refreshComplete();

    abstract int getState();

    abstract void setState(int state);

    abstract int getVisibleHeight();

}