package org.example;

import io.reactivex.disposables.Disposable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SingleObserverTest {
    private ObserverFactory factory = new ObserverFactory();

    @Test
    public void testGetObserver() {
        SingleObserver testAble = new SingleObserver();

        assertTrue(testAble.getObserver().isDisposed());
    }
}

