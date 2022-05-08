package org.example;

import io.reactivex.disposables.Disposable;

public abstract class ObserverDecorator implements Observer {
    protected Observer observerDecorated = null;

    public ObserverDecorator(Observer observerDecorated) {
        this.observerDecorated = observerDecorated;
    }

    @Override
    public Disposable getObserver() { // using synchronized because making sure of the mutual exclusion of the object state
        return this.observerDecorated.getObserver();
    }
}
