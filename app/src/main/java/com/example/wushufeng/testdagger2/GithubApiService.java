package com.example.wushufeng.testdagger2;

import java.util.ArrayList;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by wushufeng on 2016/11/15.
 */

public interface GithubApiService {
    @GET("users/{user}/repos")
    Observable<ArrayList<Repo>> getRepoData(@Path("user") String user);
}
