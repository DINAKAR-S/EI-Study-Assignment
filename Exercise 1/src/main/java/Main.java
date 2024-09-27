// Main.java (located in src/main/java)
import behavioral.observer.MainObserver;
import behavioral.strategy.MainStrategy;
import creational.singleton.MainSingleton;
import creational.factory.MainFactory;
import structural.adapter.MainAdapter;
import structural.decorator.MainDecorator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose which design pattern example to run:");
        System.out.println("1. Observer");
        System.out.println("2. Strategy");
        System.out.println("3. Singleton");
        System.out.println("4. Factory");
        System.out.println("5. Adapter");
        System.out.println("6. Decorator");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                MainObserver.main(args);
                break;
            case 2:
                MainStrategy.main(args);
                break;
            case 3:
                MainSingleton.main(args);
                break;
            case 4:
                MainFactory.main(args);
                break;
            case 5:
                MainAdapter.main(args);
                break;
            case 6:
                MainDecorator.main(args);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
