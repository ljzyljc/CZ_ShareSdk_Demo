package com.example.tempcw.cz_sharesdk_demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.ShareSDK;

/**
 * Created by TempCw on 2016/8/21.
 */
public class TestShareUI extends Activity implements View.OnClickListener{
    LinearLayout qq,qzone,sina;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);
        qq= (LinearLayout) findViewById(R.id.qq);
        qzone= (LinearLayout) findViewById(R.id.qzone);
        sina= (LinearLayout) findViewById(R.id.sina_weibo);
        qq.setOnClickListener(this);
        qzone.setOnClickListener(this);
        sina.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Platform[] platforms = ShareSDK.getPlatformList();
        switch (v.getId()){
            case R.id.qq:
                MainActivity.showShare(this, platforms[6].getName(), true);
                break;
            case R.id.qzone:
                MainActivity.showShare(this, platforms[2].getName(), true);
                break;
            case R.id.sina_weibo:
                MainActivity.showShare(this, platforms[1].getName(), true);
                break;
        }
    }
}
