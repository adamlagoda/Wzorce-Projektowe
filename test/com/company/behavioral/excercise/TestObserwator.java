package com.company.behavioral.excercise;

import org.junit.Assert;
import org.junit.Test;

public class TestObserwator {

    @Test
    public void whenObservableChangedObserversNotified() {
        NewsAgency observable = new NewsAgency();
        Channel observer = new Channel();
        observable.registerObserver(observer);

        observable.setNews("news");
        observable.notifyObservers();

        Assert.assertEquals("news", observer.getNews());
    }
}

