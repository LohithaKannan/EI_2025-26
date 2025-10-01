package src;

public class ConcreteVehicleFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle(String type) {
        switch (type) {
            case "Car": return new Car();
            case "Truck": return new Truck();
            case "Bike": return new Bike();
            default: throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}

