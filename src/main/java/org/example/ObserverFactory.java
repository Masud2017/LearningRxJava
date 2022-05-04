package org.example;

import io.reactivex.disposables.Disposable;

public class ObserverFactory {
    public enum Type {
        Single,
        Completeable,
        Maybe
    };

    Type tp;

    public Disposable getObserver(Type type) {
        if (type == null) {
            return null;
        }

        if (type == type.Single) {
            return new SingleObserver().getObserver();
        } else if (type == type.Completeable) {
            new CompleteableObserver().getObserver();
        } else if (type == type.Maybe) {
            return new MayebeObserver().getObserver();
        }

        return null;
    }
}
