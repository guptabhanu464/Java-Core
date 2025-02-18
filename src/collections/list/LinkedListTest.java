package collections.list;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<String> string = new LinkedList<>();
        string.add("Bhanu");
        string.add("Bhanu");
        string.add("Shyamn");
        string.add("Kaka");
        string.addLast("Radhe");

        string.addAll(new LinkedList<>(Arrays.asList("Hoime", "ufsufhsu")));
        System.out.println(string);
    }
}
