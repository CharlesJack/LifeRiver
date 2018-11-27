package base;

import android.app.Application;


import utils.CommonUtil;

/**
 * Created by Administrator on 2018/9/19 0019.
 */

public class BaseApplication extends Application {

    public final static String TAG = "BaseApplication";

    private static BaseApplication mInstance;

    public static BaseApplication getApplication() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        CommonUtil.init(this);
    }
}
