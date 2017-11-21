package com.vitta.mvp_test.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.SupportActivity;

/**
 * 作者：王文婷 邮箱：WVitta@126.com
 * 创建时间：2017/11/21 10:04
 * 描述：BaseActivity
 */

public abstract class BaseActivity extends SupportActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(getLayoutId());

    }

    protected abstract int getLayoutId();
}
