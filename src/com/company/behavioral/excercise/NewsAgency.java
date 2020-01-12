package com.company.behavioral.excercise;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String news;
    private List<Obserwator> observers;

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    public void registerObserver(Channel observer) {
        if (observers == null)
            observers = new ArrayList<>();
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Obserwator obserwator : observers) {
            obserwator.update(news);
        }
    }
}
