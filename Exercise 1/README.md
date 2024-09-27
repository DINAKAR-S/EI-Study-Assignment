# Exercise 1: Design Patterns in Java

## Overview
This project demonstrates six different design patterns in Java. The patterns implemented include:
- **Behavioral Patterns:** Observer, Strategy
- **Creational Patterns:** Singleton, Factory
- **Structural Patterns:** Adapter, Decorator

Each pattern is implemented in its own package, containing related classes and a `Main` class that showcases how the pattern works.


## Requirements
- **Java Development Kit (JDK)** 8 or later.
- An IDE like IntelliJ IDEA or Eclipse (optional).
- **JUnit** for running tests (if you want to run the test classes).

## How to Run
### Using an IDE
1. Open the project in your preferred IDE.
2. Navigate to the `src/main/java/` directory.
3. For each design pattern, right-click on the `Main` class (e.g., `MainObserver.java`) and select **Run**.
4. Check the console output for results.

### Using the Command Line
1. Navigate to the project root directory:
    ```bash
    cd path/to/exercise1/src/main/java
    ```
2. Compile all Java files:
    ```bash
    javac */*/*.java
    ```
3. Run a specific design pattern:
    ```bash
    java behavioral.observer.MainObserver
    ```

## Tests
- Test classes are located in `src/test/java/`.
- You can run these tests using an IDE's test runner or a command line if you have JUnit set up.

## Known Issues
- No complex input validation or exception handling in the `Main` classes. These are simple demonstrations of design patterns.

## Future Enhancements
- Implement more design patterns.
- Add more complex use cases to demonstrate the patterns.
