package org.example;

import io.reactivex.disposables.Disposable;

public class ObserverDecoratorImpl extends ObserverDecorator{

    public ObserverDecoratorImpl(Observer observerDecorated) {
        super(observerDecorated);
    }

    @Override
    public Disposable getObserver() {
       return this.observerDecorated.getObserver();
    }

    private String getStringFromObserver() {
        return this.observerDecorated.getObserver().toString();
    }

    // Now don't know how to add this two method .. as I don't need to do that in this context. But I think I got enough idea
    // about how the decorator class works
}
