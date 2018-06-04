package com.jcodecraeer.xrecyclerview;

/**
 * Created by jianghejie on 15/11/22.
 */
interface BaseRefreshHeader {
/*
* 0 不刷新
* 1 释放刷新
* 2 正在刷新
* 3 刷新完成
* */
	int STATE_NORMAL = 0;
	int STATE_RELEASE_TO_REFRESH = 1;
	int STATE_REFRESHING = 2;
	int STATE_DONE = 3;

	void onMove(float delta);

	boolean releaseAction();

	void refreshComplete();

}