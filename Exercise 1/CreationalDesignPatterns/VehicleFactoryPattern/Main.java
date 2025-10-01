import src.*;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new ConcreteVehicleFactory();
        Vehicle car = factory.createVehicle("Car");
        car.drive();  // Output: Driving a car...
        Vehicle truck = factory.createVehicle("Truck");
        truck.drive();  // Output: Driving a truck...
        Vehicle bike = factory.createVehicle("Bike");
        bike.drive();  // Output: Riding a bike...
    }
}
