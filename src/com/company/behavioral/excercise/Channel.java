package com.company.behavioral.excercise;

public class Channel implements Obserwator {
    private String news;

    public String getNews() {
        return news;
    }

    @Override
    public void update(String news) {
        this.news = news;
    }
}
