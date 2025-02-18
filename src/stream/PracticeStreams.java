package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.stream.Stream;

public class PracticeStreams {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0,1,2,3,4,5,7,9,11);
        // Now here can approaches to solve the Above list if want to
        // Square of each Number
        // Even number
        // Odd number

        // Lets try with Square of each number
        // The below is the traditional approach of doing this
        List<Integer> result = new ArrayList<>();
        for(int i : list) {
            result.add(i * i);
        }
        System.out.println(result);

        // Now we will be using streams
        // Below we can see we have to write one single line of code
        // Square of each number
        List<Integer> result1 = list.stream().map(n -> n * n).toList();
        System.out.println(result1);


        // Let try odd number

        // Filter - intermediate operation
        // Map - Intermediate operation

        // Source - It is the list which we are providing
        // We can also say that the data which we providing on which we will be using the stream operation

//        Integer count = (int) list.stream().filter(x -> x % 2 != 0).count();
//        System.out.println(count);
//
//        // How to create streams
//        // 1 Using Collections
//
//        Stream<Integer> streams = list.stream();
//
//        // 2 - Arrays
//        String[] arr = {"a","b","c"};
//        Integer[] arr1 = {1,2,3,4};
//        Stream<String> stringStream = Arrays.stream(arr);
//
//        // 3 - Using Stream.of()
//
//        Stream<String> stream1 = Stream.of(arr);
//        Stream<Integer> stream2 = Stream.of(arr1);
//        // Just an example was trying something
//        System.out.println(stream1.filter(x -> x.startsWith("a")).count());
//
//        // 4 - Infinite streams
//        Stream.generate(() -> 1);
//
//        List<Integer> streams3 =   Stream.iterate(1 , x-> x + 1).limit(100).toList();
//        System.out.println(streams3);
    }


}
