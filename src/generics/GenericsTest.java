package generics;

public class GenericsTest {

    public static void main(String[] args) {

        Box<Integer> box = new Box<>();
        box.setValue(11);


        Object value =  box.getValue();
        System.out.println(value);


        Plane<Integer> integerPlane = new Plane<>(123);
        integerPlane.setName(234);
        integerPlane.showItem();

    }
}
