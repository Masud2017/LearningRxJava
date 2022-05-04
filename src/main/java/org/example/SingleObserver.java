package org.example;

import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

public class SingleObserver implements Observer{
    @Override
    public Disposable getObserver() {
        Single<String> single = Single.just("Hello world this is reactive programming");
//        System.out.println( "Hello World!" );
        Disposable disposable = single
                .delay(2, TimeUnit.SECONDS, Schedulers.io())
                .subscribeWith(
                        new DisposableSingleObserver<String>() {

                            @Override
                            public void onError(Throwable e) {
                                e.printStackTrace();
                            }

                            @Override
                            public void onSuccess(String value) {
                                System.out.println(value);
                            }
                        });
        return disposable;
    }
}
