package designpatterns.creational.builder;

public class CarMain {

    public static void main(String[] args) {

        Car car = new Car();
        car.setAirBags(4);
        car.setEngineName("CVT Petrol");
        car.setAlloyWheels(true);
        car.setAudioSystem(true);
        System.out.println(car);

        Car car1 = new Car.CarBuilder().setEngineName("amt petrol")
                .setAirBags(2)
                .setAlloyWheels(false)
                .setAudioSystem(false)
                .build();
        System.out.println(car1);
    }
}
