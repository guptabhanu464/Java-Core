package designpatterns.creational.factory;

public class VehicleFactory {

    public Vehicle getVehicle(String typeOfVehicle) {
        if(typeOfVehicle == null) {
            return null;
        }
        if(typeOfVehicle.equalsIgnoreCase("Car")) {
            return new Car();
        }
        if(typeOfVehicle.equalsIgnoreCase("Bike")) {
            return new Bike();
        }

        return null;
    }

    // Another Method Of Factory Design pattern
    public Vehicle getVehicles(VehicleType typeOfVehicle) {
        return switch (typeOfVehicle) {
            case CAR -> new Car();
            case BIKE -> new Bike();
        };
    }

}
