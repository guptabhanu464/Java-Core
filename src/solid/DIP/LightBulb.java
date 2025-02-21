package solid.DIP;

public class LightBulb implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Turn On the bulb");
    }
}
