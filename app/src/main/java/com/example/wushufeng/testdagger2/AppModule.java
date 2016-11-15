package com.example.wushufeng.testdagger2;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wushufeng on 2016/11/15.
 */
@Module
public class AppModule {
    private Application application;

    public AppModule(Application application) {

        this.application = application;
    }

    @Provides
    public Application provideApplication() {

        return application;
    }
}
