package org.example;

import io.reactivex.Maybe;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableMaybeObserver;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

public class MayebeObserver implements Observer {

    @Override
    public Disposable getObserver() {
        Disposable mayBeObserver = Maybe.just("Hello world this is maybe ")
                .delay(2, TimeUnit.SECONDS, Schedulers.io())
                .subscribeWith(new DisposableMaybeObserver<String>() {

                    @Override
                    public void onSuccess(@NonNull String s) {
                        System.out.println(s);
                    }

                    @Override
                    public void onError(@NonNull Throwable throwable) {
                        throwable.printStackTrace();
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("Yo complete");

                    }
                });

        return mayBeObserver;
    }
}
