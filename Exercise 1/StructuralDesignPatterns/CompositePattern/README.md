# Company Hierarchy Example

## Overview
This project demonstrates the Composite design pattern in Java. The pattern is used to represent a hierarchy of employees in a company, where both individual employees (like Developers) and groups of employees (like Managers) are represented by the same interface (`Employee`).

## Structure
- **Employee**: An interface representing a general employee with a method `showEmployeeDetails`.
- **Developer**: A class representing an individual employee, implementing the `Employee` interface.
- **Manager**: A class representing a manager who can have subordinate employees, also implementing the `Employee` interface.

## How to Run
1. Ensure you have Java installed on your machine.
2. Compile the Java files:
javac src/*.java Main.java
3. Run the Main class
4. You should see the following output:
005 Michael
003 Robert
001 John
002 David
004 Alice