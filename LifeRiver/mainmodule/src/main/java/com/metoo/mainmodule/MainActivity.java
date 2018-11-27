package com.metoo.mainmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.alibaba.android.arouter.launcher.ARouter;

import okhttp3.Call;
import utils.NetUtil.CallBackUtil;
import utils.NetUtil.OkhttpUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.app_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://testm.10jqka.com.cn/mobile/info/gcx/eq/gphone.txt";
                OkhttpUtil.okHttpGet(url, new CallBackUtil.CallBackString() {
                    @Override
                    public void onFailure(Call call, Exception e) {

                    }

                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(MainActivity.this,response,Toast.LENGTH_LONG).show();
                    }
                });
            }
        });

        Button btn1 = findViewById(R.id.app_btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/home_module/center").navigation();
            }
        });
        Button btn2 = findViewById(R.id.app_btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/main_module/page2").navigation();
            }
        });
    }
}
