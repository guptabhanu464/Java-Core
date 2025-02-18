package designpatterns.factory;

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
}
