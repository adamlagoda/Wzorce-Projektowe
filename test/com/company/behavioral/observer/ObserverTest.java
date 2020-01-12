package com.company.behavioral.observer;

import org.junit.Assert;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void whenObservableChangedObserversNotified() {
        PCLNewsAgency observable = new PCLNewsAgency();
        PCLNewsChannel observer = new PCLNewsChannel();

        observable.addPropertyChangeListener(observer);
        Assert.assertNull(observer.getNews());
        observable.setNews("news");

        Assert.assertEquals(observer.getNews(), "news");
    }
}
