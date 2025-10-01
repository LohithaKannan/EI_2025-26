# Vehicle Factory Pattern

## Overview
This project demonstrates the use of the Factory Method pattern in Java. The pattern is used to create instances of different types of vehicles (Car, Truck, Bike) without specifying the exact class of the object that will be created.

## Structure
- **Vehicle**: An interface that all vehicle types implement.
- **Car, Truck, Bike**: Concrete implementations of the Vehicle interface.
- **VehicleFactory**: An abstract class that declares the factory method `createVehicle`.
- **ConcreteVehicleFactory**: A concrete implementation of the factory that creates instances of vehicles.

## How to Run
1. Ensure you have Java installed on your machine.
2. Compile the Java files:
javac src/*.java Main.java
3. Run the Main class
4. You should see the following output:
Driving a car...
Driving a truck...
Riding a bike...