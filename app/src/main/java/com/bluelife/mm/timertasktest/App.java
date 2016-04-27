package com.bluelife.mm.timertasktest;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by slomka.jin on 2016/4/27.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(this,"900028052",true);
    }
}
