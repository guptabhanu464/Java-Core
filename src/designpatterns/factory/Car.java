package designpatterns.factory;

public class Car implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    @Override
    public void deAccelerate() {
        System.out.println("Car is deaccelerating");
    }
}
