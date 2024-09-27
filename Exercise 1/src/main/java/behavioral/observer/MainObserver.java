package behavioral.observer;

public class MainObserver {
    public static void main(String[] args) {
        NewsFeed newsFeed = new NewsFeed();
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        newsFeed.registerObserver(user1);
        newsFeed.registerObserver(user2);

        newsFeed.publishNews("Breaking News: Observer Pattern Implemented!");

        newsFeed.removeObserver(user1);
        newsFeed.publishNews("New Update: Observer Pattern Demonstration Completed.");
    }
}
