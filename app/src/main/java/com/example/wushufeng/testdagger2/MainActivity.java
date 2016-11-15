package com.example.wushufeng.testdagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.http.Path;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.show)
    TextView show;

    //@Inject
    GithubApiService githubApiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        AppAplication.getsInstance().getAppComponent().inject(this);
        githubApiService = new GithubApiService() {
            @Override
            public Observable<ArrayList<Repo>> getRepoData(@Path("user") String user) {
                return null;
            }
        };

        githubApiService.getRepoData("shufengwu")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ArrayList<Repo>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(ArrayList<Repo> repos) {
                        String str = "";
                        for (int i = 0; i < repos.size(); i++) {
                            str += repos.get(i).getName() + "\n"
                                    + repos.get(i).getDescription()+"\n"
                                    +repos.get(i).getLanguage()+"\n\n";
                        }
                        show.setText(str);
                    }
                });
    }
}
