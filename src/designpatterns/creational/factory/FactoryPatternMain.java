package designpatterns.creational.factory;

public class FactoryPatternMain {

    public static void main(String[] args) {

        VehicleFactory factory = new VehicleFactory();

        Vehicle car = factory.getVehicle("Car");
        car.accelerate();
        Vehicle bike = factory.getVehicle("Bike");
        bike.accelerate();

        VehicleFactory factory1 = new VehicleFactory();

        Vehicle car1 = factory1.getVehicles(VehicleType.CAR);
        Vehicle bike1 = factory1.getVehicles(VehicleType.BIKE);
        car1.deAccelerate();
        bike1.deAccelerate();
    }
}
