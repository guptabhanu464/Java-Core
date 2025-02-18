package designpatterns.factory;

public class FactoryPatternMain {

    public static void main(String[] args) {

        VehicleFactory factory = new VehicleFactory();

        Vehicle car = factory.getVehicle("Car");
        car.accelerate();
        Vehicle bike = factory.getVehicle("Bike");
        bike.accelerate();

    }
}
