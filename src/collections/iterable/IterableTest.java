package collections.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableTest {

    public static void main(String[] args) {

        // Iterable Interface - Helps to Traverse The Collection
        // Methods - iterator() - return iterator object
        // Further We can use methods on iterator object i.e -
        // hasNext() - return true if elements are present
        // next() - return next element
        // remove() - remove last element returned by iterator

        //

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println("Printing All the values");
        Iterator<Integer> integerIterator = list.iterator();
        while(integerIterator.hasNext()) {
            int val = integerIterator.next();
            System.out.println(val);
            if(val == 3) {
                integerIterator.remove();
            }

        }


        System.out.println("Printing Using For Each Method");
        // This basically Takes Consumer
        // We have provided method reference or Lambda Expression
        list.forEach(System.out::println);



    }
}
