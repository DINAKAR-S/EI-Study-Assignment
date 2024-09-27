package behavioral.observer;

public class User implements Observer {
    private String name;
    private String latestNews;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        this.latestNews = news;
        System.out.println(name + " received news: " + news);
    }

    public String getLatestNews() {
        return latestNews;
    }
}
