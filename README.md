# EI-Study-Assignment

# Java Programming Exercises: Design Patterns & Astronaut Daily Schedule Organizer

## Overview

This repository contains two separate Java console-based applications:

1. **Exercise 1: Design Patterns Implementation**
    - Demonstrates six different design patterns: Observer, Strategy, Singleton, Factory, Adapter, and Decorator.
    - Each design pattern is implemented in its respective package and includes examples showcasing how to use them.

2. **Exercise 2: Astronaut Daily Schedule Organizer**
    - A console-based application that helps astronauts organize their daily schedules.
    - Implements basic CRUD operations (Create, Read, Update, Delete) for daily tasks with validation and error handling.
    - Utilizes design patterns: Singleton, Factory, and Observer.


## Requirements

- **Java Development Kit (JDK)** 8 or later.
- An IDE like IntelliJ IDEA or Eclipse (optional).
- **JUnit** for running tests.

## Running the Applications

### **Exercise 1: Design Patterns**
#### Using an IDE
1. Open the `exercise1` project in your preferred IDE.
2. Navigate to the `src/main/java/` directory.
3. For each design pattern, right-click on the `Main` class (e.g., `MainObserver.java`) and select **Run**.
4. The console will display the output for each pattern's implementation.

#### Using the Command Line
1. Navigate to the `src/main/java` directory:
    ```bash
    cd path/to/ProjectRoot/exercise1/src/main/java
    ```
2. Compile all Java files:
    ```bash
    javac */*/*.java
    ```
3. Run a specific design pattern:
    ```bash
    java behavioral.observer.MainObserver
    ```

### **Exercise 2: Astronaut Daily Schedule Organizer**
#### Using an IDE
1. Open the `exercise2` project in your preferred IDE.
2. Navigate to `src/main/java/`.
3. Right-click on `Main.java` in the `main` package and select **Run**.
4. Follow the prompts in the console to interact with the application (add, remove, view, or mark tasks).

#### Using the Command Line
1. Navigate to the `src/main/java` directory:
    ```bash
    cd path/to/ProjectRoot/exercise2/src/main/java
    ```
2. Compile the Java files:
    ```bash
    javac main/Main.java controller/*.java model/*.java utils/*.java
    ```
3. Run the application:
    ```bash
    java main.Main
    ```

## Features

### **Exercise 1: Design Patterns**
- Implements six design patterns:
  - **Behavioral Patterns**: Observer, Strategy
  - **Creational Patterns**: Singleton, Factory
  - **Structural Patterns**: Adapter, Decorator

### **Exercise 2: Astronaut Daily Schedule Organizer**
- **CRUD Operations**: Add, remove, and view tasks.
- **Validation**: Ensures no overlapping tasks are scheduled.
- **Design Patterns Used**:
  - **Singleton Pattern**: Ensures there is only one instance of `ScheduleManager`.
  - **Factory Pattern**: Creates task objects using `TaskFactory`.
  - **Observer Pattern**: Observes task conflicts and notifies users.
- **Optional Features**: Mark tasks as completed.

## Tests
- Test classes for both exercises are located in their respective `test/java/` directories.
- Use JUnit to run tests. In an IDE, right-click on the test classes and select **Run** to execute them.

## Error Handling
- Handles input validation errors (e.g., invalid time format, invalid priority).
- Logs errors using the `LoggerUtil` utility.

## Known Issues
- **Exercise 1**: The main classes demonstrate basic usage of the design patterns; additional input validation is not included.
- **Exercise 2**: Limited time format validation; further enhancements can be made.

## Future Enhancements
- Add a GUI for the schedule organizer in **Exercise 2**.
- Implement more complex use cases for the design patterns in **Exercise 1**.

## Logging
- Both exercises use a custom `LoggerUtil` class to log information and errors.

---

This README provides a comprehensive overview of both exercises, covering all necessary information to understand, run, and extend the applications.
