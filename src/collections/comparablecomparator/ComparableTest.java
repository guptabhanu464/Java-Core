package collections.comparablecomparator;

import java.util.Arrays;
import java.util.Objects;

public class ComparableTest {

    public static void main(String[] args) {

        Car[] arrays = new Car[4];
        arrays[0] = new Car("SUV","Hyundai");
        arrays[1] = new Car("HatchBack","Maruti");
        arrays[2] = new Car("Truck","Honda");
        arrays[3] = new Car("2 Wheeler","Activa");


        Arrays.sort(arrays , (a , b) -> a.getType().compareTo(b.getType())); // This is basically use of Comparator / Functional Interface
     //   Arrays.sort(arrays);

        for(Car car : arrays) {
            if(Objects.equals(car.getType(), "2 Wheeler")) {
                System.out.println("Name of brand " + car.getCompanyName() + " type of the scooter " + car.getType());
            } else {
                System.out.println("Name of brand " + car.getCompanyName() + " type of the car " + car.getType());

            }
        }
    }
}
