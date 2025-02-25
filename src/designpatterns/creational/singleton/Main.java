package designpatterns.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Here we have get the object
      //  EagerIntialization object = EagerIntialization.getInstance();

       // LazyIntialization lazyIntialization = LazyIntialization.getInstance();
       // Thread t1 = new Thread();
        //Thread t2 = new Thread();

        List<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Shyam");
        ImmutableClass clas = new ImmutableClass("Bhanu", names);
       // clas.getDesignation().add("Kaka");
        System.out.println(clas.getDesignation());


    }
}
