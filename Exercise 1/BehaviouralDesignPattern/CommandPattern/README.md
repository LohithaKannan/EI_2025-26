# Command Pattern Example

## Overview
This project demonstrates the Command design pattern in Java. The pattern encapsulates a request as an object, thereby allowing for parameterization of clients with different requests, queuing of requests, and logging of the requests. In this example, a simple text editor supports writing and undoing text commands.

## Structure
- **Command**: An interface defining the `execute` and `undo` methods.
- **WriteCommand**: A concrete command class implementing the `Command` interface to write text to a `TextEditor`.
- **TextEditor**: The receiver class that performs actual operations on the text.
- **TextEditorInvoker**: The invoker class that maintains a history of commands and provides methods to execute and undo commands.
- **Main**: The client class that interacts with the `TextEditor` and `TextEditorInvoker` via user input.

## How to Run
1. Ensure you have Java installed on your machine.
2. Compile the Java
javac src/*.java Main.java files:
3. Run the Main class:
4. Follow the on-screen prompts to enter commands (e.g., `write Hello`, `undo`, `exit`).


