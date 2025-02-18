package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOps {
    public static void main(String[] args) {

        // Count
        // Distinct
        // findFirst , findAny            ---------------   // this and below operations are short circuit operations
        // anyMatch , allMatch , noneMatch --------------   // means if any of conditions they get is fulfilling the predicate
        // condition they will stop the processing and return the result.

        List<String> names = Arrays.asList("RAM","SHYAM","BHANU","RAJU");
        // Here we have to find the names which have names length equal to 3 or more than 3
        List<String> list = names.stream().filter(n -> n.length()  > 3).toList();
        System.out.println(list);

        List<Integer> numbers = Arrays.asList(1,5,5,10,87,45,78);
        List<Integer> list1 = numbers.stream().map(x -> x * x).distinct().sorted().toList();
        System.out.println(list1);

        Optional<Integer> reduce = numbers.stream().distinct().reduce(Integer::sum);
        System.out.println(reduce.get());

        String s = "My name is Bhanu Gupta";
        char[] charArray = s.toCharArray();
        //IntStream chars = s.chars().filter();
    }






}
