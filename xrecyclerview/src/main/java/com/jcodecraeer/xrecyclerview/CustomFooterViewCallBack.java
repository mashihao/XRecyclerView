package com.jcodecraeer.xrecyclerview;

import android.view.View;

/**
 * 作者：林冠宏
 * <p>
 * My GitHub : https://github.com/af913337456/
 * <p>
 * My Blog   : http://www.cnblogs.com/linguanh/
 * <p>
 * on 2017/11/8.
 */

public interface CustomFooterViewCallBack {

    //加载更 ing
    void onLoadingMore(View yourFooterView);
    // 加载成功
    void onLoadMoreComplete(View yourFooterView);
    //没有更多
    void onSetNoMore(View yourFooterView,boolean noMore);

}
