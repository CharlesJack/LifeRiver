package com.metoo.liferiver;

import com.alibaba.android.arouter.launcher.ARouter;
import com.google.common.collect.Multimap;

import base.BaseApplication;
import utils.CommonUtil;

/**
 * Created by Administrator on 2018/9/19 0019.
 */

public class MyApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        if (CommonUtil.isAppDebug()) {
            //开启InstantRun之后，一定要在ARouter.init之前调用openDebug
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }
}
