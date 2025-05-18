package collections.comparablecomparator;

import java.util.*;

public class ComparableTest {

    public static void main(String[] args) {

        Car[] arrays = new Car[4];
        arrays[0] = new Car("SUV","Hyundai");
        arrays[1] = new Car("HatchBack","Maruti");
        arrays[2] = new Car("Truck","Honda");
        arrays[3] = new Car("2 Wheeler","Activa");


        Set<Integer> integerList = new TreeSet<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(10);
        integerList.add(4);
        integerList.add(7);
        integerList.add(8);

        //List<Integer> list = integerList.stream().sorted(Collections.reverseOrder()).toList();
        integerList.forEach(System.out::println);

        Arrays.sort(arrays , (a , b) -> a.getType().compareTo(b.getType())); // This is basically use of Comparator / Functional Interface
     //   Arrays.sort(arrays);

//        for(Car car : arrays) {
//            if(Objects.equals(car.getType(), "2 Wheeler")) {
//                System.out.println("Name of brand " + car.getCompanyName() + " type of the scooter " + car.getType());
//            } else {
//                System.out.println("Name of brand " + car.getCompanyName() + " type of the car " + car.getType());
//
//            }
//        }
    }
}
