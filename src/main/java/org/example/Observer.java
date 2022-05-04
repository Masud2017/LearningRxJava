package org.example;

import io.reactivex.disposables.Disposable;

public interface Observer {
    public Disposable getObserver();
}
