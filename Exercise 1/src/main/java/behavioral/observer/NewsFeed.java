package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsFeed {
    private List<Observer> observers = new ArrayList<>();
    private String latestNews;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void publishNews(String news) {
        this.latestNews = news;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestNews);
        }
    }
}
