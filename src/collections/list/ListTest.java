package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        int[] arr = new int[10]; // Defined size in Array

        ArrayList<Integer> arrayList = new ArrayList<>(); // Here we have to define what type of data to be stored
        arrayList.add(1);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.addFirst(59);

        // Now above array list is not sorted
        //arrayList.sort(null); // Default sorting - Increasing to decreasing

        // Now we can using Comparator Interface as well
        arrayList.sort((o1 , o2) -> o1 - o2);


        List<String> names = Arrays.asList("Bhanu", "Ram", "Shyam"); // Returns Unmodifable List // cannot remove or delete
        List<String> stringList = List.of("Hello", "Bhanu", "Entreprenuer");

        List<String> newList = new ArrayList<>(stringList);

        // names.remove("Bhanu"); This method will give exception
        //List<String> strings = new ArrayList<>(names);

        names.sort((a, b) -> a.length() - b.length()); // Fading because increasing to decreasing is natural sorting.
        newList.sort((a, b) -> b.length() - a.length()); // Not fading because decreasing to increasing and it is not natural sorting.
        System.out.println(newList);
        System.out.println(names);

//        arrayList.set(0 , 20); // replaces the element present at particular index

        for(int x : arrayList) {
            System.out.println(x);
        }

        //System.out.println(arrayList);
       // arrayList.add(5,0);
    }
}

class StringComparator implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

class IntegerComparator implements Comparator<Integer> {


    // Increasing to Decreasing
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o1 - o2;
//    }

    // Decreasing to Increasing
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}