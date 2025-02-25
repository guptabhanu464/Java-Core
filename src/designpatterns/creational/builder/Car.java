package designpatterns.creational.builder;


public class Car {

    private String engineName;
    private Integer airBags;

    // Optional Field
    private boolean audioSystem;
    private boolean alloyWheels;

    public Car() {

    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public Integer getAirBags() {
        return airBags;
    }

    public void setAirBags(Integer airBags) {
        this.airBags = airBags;
    }

    public boolean isAudioSystem() {
        return audioSystem;
    }

    public void setAudioSystem(boolean audioSystem) {
        this.audioSystem = audioSystem;
    }

    public boolean isAlloyWheels() {
        return alloyWheels;
    }

    public void setAlloyWheels(boolean alloyWheels) {
        this.alloyWheels = alloyWheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineName='" + engineName + '\'' +
                ", airBags=" + airBags +
                ", audioSystem=" + audioSystem +
                ", alloyWheels=" + alloyWheels +
                '}';
    }

    // Private Constructor to enforce
    private Car(CarBuilder builder) {
        this.engineName = builder.engineName;
        this.airBags = builder.airBags;
        this.alloyWheels = builder.alloyWheels;
        this.audioSystem = builder.audioSystem;

    }

    public static class CarBuilder {

        private String engineName;
        private Integer airBags;
        //
        private boolean audioSystem;
        private boolean alloyWheels;

//        public CarBuilder(String name) {
//            this.engineName = name;
//            //this.airBags = bags;
//        }


        public CarBuilder setEngineName(String engineName) {
            this.engineName = engineName;
            return this; // We are returing the object
        }

        public CarBuilder setAirBags(Integer airBags) {
            this.airBags = airBags;
            return this; // We are returing the object
        }

        public CarBuilder setAudioSystem(boolean audioSystem) {
            this.audioSystem = audioSystem;
            return this; // We are returing the object
        }

        public CarBuilder setAlloyWheels(boolean alloyWheels) {
            this.alloyWheels = alloyWheels;
            return this; // We are returing the object
        }

        public Car build() {
            return new Car(this);
        }


    }

}
