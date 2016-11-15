package com.example.wushufeng.testdagger2;

import dagger.Component;

/**
 * Created by wushufeng on 2016/11/15.
 */
@Component (modules = {AppModule.class,GithubApiModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}
