# Flyweight Pattern Example

## Overview
This project demonstrates the Flyweight design pattern in Java. The pattern is used to minimize memory usage by sharing as much data as possible with similar objects. In this example, the `Circle` objects are shared based on their color.

## Structure
- **Shape**: An interface for drawing shapes.
- **Circle**: A concrete implementation of the `Shape` interface representing a circle.
- **ShapeFactory**: A factory class that manages the creation and reuse of `Circle` objects.

## How to Run
1. Ensure you have Java installed on your machine.
2. Compile the Java files:
javac src/*.java Main.java
3. Run the Main class
4. You should see output similar to:

Creating circle of color: Red
Drawing Circle [Color: Red, x: 23, y: 65, radius: 100]
Creating circle of color: Green
Drawing Circle [Color: Green, x: 77, y: 12, radius: 100]
...