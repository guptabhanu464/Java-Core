package collections;

import java.util.*;

public class TestCollection {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(3); // Duplicates are allowed

        // Used when faster access of elements on the basis of index
        Integer integer = integers.get(2); // O(1)
        System.out.println(integers); // Fast random Access
        System.out.println(integer);


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3); // Duplicates are also allowed
        linkedList.add(3);

        // Use when Frequent Insertion oR dELETE
        linkedList.addLast(4); // O(1) at last
        linkedList.addFirst(0); // O(1) at first
        System.out.println(linkedList);

        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(1);
        integerHashSet.add(1); // Duplicates are not added

        boolean contains = integerHashSet.contains(1);
        // wHEN NEED uNIQUE ELEMENTS
        System.out.println(integerHashSet);
        System.out.println(contains);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        linkedHashSet.add(1);
        linkedHashSet.add(1); // Insertion order is maintained

        System.out.println(linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<>();
       // treeSet.add("Apple");
        treeSet.add("Cat");
        treeSet.add("Apple");
        treeSet.add("Dog"); // Sort elements
        String dog = treeSet.ceiling("Dog");

        System.out.println(treeSet);
        System.out.println(dog);
    }
}
