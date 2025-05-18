package reflection;

import java.lang.reflect.Method;

public class Eagle {


    public static void main(String[] args) throws NoSuchMethodException {

        EagleTest test = new EagleTest();

        Class classTest = test.getClass();
//        System.out.println(classTest.getName());
//        System.out.println(classTest.getMethod("fly").getName());

        // getDeclaredMethod - will get all methods which are public and private of Eagle Class Only
        Method[] declaredMethods = classTest.getDeclaredMethods();
        for(Method m : declaredMethods) {
            System.out.println("Name of the method :" + m.getName());
        }

    }




    static class EagleTest {

        private String breed;
        private boolean canSwim;

        public void fly() {
            System.out.println("Eagle can fly");
        }

        public void eat() {
            System.out.println("Eagle can eat");
        }

    }

}






