package org.example;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.Completable;
import io.reactivex.observers.DisposableCompletableObserver;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;


public class CompleteableObserver implements Observer {
    @Override
    public Disposable getObserver() {
        Disposable completeAbleObserver = Completable.complete().delay(2, TimeUnit.SECONDS, Schedulers.io()).subscribeWith(new DisposableCompletableObserver() {
            @Override
            public void onStart() {
                System.out.println("started");
            }
            @Override
            public void onComplete() {
                System.out.println("Yo this is a success full stuff");
            }

            @Override
            public void onError(@NonNull Throwable throwable) {
                throwable.printStackTrace();
            }
        });
        return completeAbleObserver;
    }
}
