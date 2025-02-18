package oops.abstraction;

public class Car extends Vehicle {


    @Override
    public void accelerate() {
        System.out.println("Car is speeding");
    }

    @Override
    public void deAccelerate() {
        System.out.println("Car speed is decreasing");
    }
}
