package solid.DIP;

public class Switch {

    private Switchable switchable; // Tightly Coupled , If we want to turn Anything Else we won't be able to that

    // Constructor Injection
    public Switch(Switchable device) {
        this.switchable = device;
    }

    public void turnOn() {
        switchable.turnOn();
    }

    public static void main(String[] args) {

        Switch fan = new Switch(new Fan());
        Switch bulb = new Switch(new LightBulb());

        fan.turnOn();
        bulb.turnOn();
    }

}


