# Exercise 2: Task Manager Application

## Overview
This project is a console-based task manager application implemented in Java. The application allows users to:
- Add tasks with descriptions, start and end times, and priorities.
- Remove tasks.
- Mark tasks as completed.
- List all tasks.

The code follows the principles of object-oriented programming and demonstrates the use of design patterns such as MVC (Model-View-Controller) and utility classes for logging.


## Requirements
- **Java Development Kit (JDK)** 8 or later.
- An IDE like IntelliJ IDEA or Eclipse (optional).
- **JUnit** for running tests (if you want to run the test classes).

## How to Run
### Using an IDE
1. Open the project in your preferred IDE.
2. Navigate to `src/main/java/`.
3. Right-click on `Main.java` in the `main` package and select **Run**.
4. Follow the console prompts to add, remove, list, or mark tasks as completed.

### Using the Command Line
1. Navigate to the `src/main/java` directory:
    ```bash
    cd path/to/exercise2/src/main/java
    ```
2. Compile the Java files:
    ```bash
    javac */*/*.java
    ```
3. Run the application:
    ```bash
    java main.Main
    ```

## Usage
1. After running, the console will display a menu with options to add, remove, mark as completed, or list tasks.
2. Follow the on-screen prompts to manage tasks.

### Sample Commands
- **Add Task**: Enter task description, start time, end time, and priority when prompted.
- **Remove Task**: Provide the index of the task to remove.
- **List Tasks**: Displays all tasks with their details and statuses.

## Tests
- Unit tests are located in the `src/test/java` directory.
- To run the tests using an IDE, right-click on the test classes and select **Run**.
- To run tests using the command line, use JUnit with the appropriate command.

## Known Issues
- Simple input validation. Enhancements can be made for more complex input handling.
- Limited exception handling in the main application loop.

## Future Enhancements
- Add date-time parsing for more robust start and end time validation.
- Implement additional features like task prioritization and filtering.
- Integrate file I/O to save and load tasks.

## Logging
- Uses `LoggerUtil` for logging information and errors throughout the application.

