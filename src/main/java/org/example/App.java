package org.example;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;


/**
 * Hello world!
 *
 */

//        Disposable dispose = factory.getObserver(ObserverFactory.Type.Maybe);
//
//
//        Thread.sleep(2000);
//        dispose.dispose();
public class App 
{


    public static void main( String[] args ) throws InterruptedException {
        ObserverFactory factory = new ObserverFactory();
        CompositeDisposable disposableContainer = new CompositeDisposable();
        ObserverFactory.Type[] arr = ObserverFactory.Type.values();

        for (ObserverFactory.Type tp : arr) {
            Disposable disposable = factory.getObserver(tp);
            if (disposable != null) {
                disposableContainer.add(disposable);
            }

        }

        Thread.sleep(3000);
        disposableContainer.dispose();
    }
}
