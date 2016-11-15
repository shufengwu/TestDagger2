package com.example.wushufeng.testdagger2;

import android.app.Application;

/**
 * Created by wushufeng on 2016/11/15.
 */

public class AppAplication extends Application {
    private static AppAplication sInstance;
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.sInstance = this;
        setupComponent();
    }

    private void setupComponent() {
        //生成AppComponent对象
        appComponent = DaggerAppComponent.builder().githubApiModule(new GithubApiModule()).appModule(new AppModule(this)).build();
    }

    public static AppAplication getsInstance() {
        return sInstance;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
