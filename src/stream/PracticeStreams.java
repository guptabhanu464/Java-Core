package stream;

import java.util.*;
import java.util.stream.Collectors;
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
       // System.out.println(result);

        // Now we will be using streams
        // Below we can see we have to write one single line of code
        // Square of each number
        List<Integer> result1 = list.stream().map(n -> n * n).toList();
        //System.out.println(result1);


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

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list1 = numbers.stream().filter(n -> n % 2 == 0).toList();
       // list1.forEach(System.out::println);

        // Sum of numbers using reduce method
        Integer reduce = numbers.stream().reduce(0, Integer::sum);
      //  System.out.println(reduce);

        List<Integer> numbersmAX = Arrays.asList(10, 20, 30, 40);
        Integer integer = numbersmAX.stream().max(Integer::compare).orElse(0);
       // System.out.println(integer);

        List<String> names = Arrays.asList("alice", "bob");
        List<String> list2 = names.stream().map(String::toUpperCase).toList();
      //  list2.forEach(System.out::println);

        List<String> names1 = Arrays.asList("Alice", "Bob", "Charlie");
        Map<Integer, List<String>> collect = names1.stream().collect(Collectors.groupingBy(String::length));
      //  System.out.println(collect);

        List<String> words = Arrays.asList("apple", "banana", "apple");
        Map<String, Long> collect1 = words.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
       //System.out.println(collect1);

        List<String> words1 = Arrays.asList("Java", "is", "awesome");
        String collect2 = words1.stream().collect(Collectors.joining(" "));
    //    System.out.println(collect2);

        String s = "Bhanu Gupta".replace(" ","");
        //Map<Character,Integer> map = new LinkedHashMap<>();
        Map<Character, Long> collect3 = s.replace(" ","").chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,Collectors.counting()));
       // System.out.println(collect3);

        //String s = "programming";
        //char[] charArray = s.toCharArray();
        //Map<Character, Long> collect10 = s.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        String str = "swiss";

        Map<Character,Integer> map1 = new LinkedHashMap<>();
        for(char ch : str.toCharArray()) {
            map1.put(ch , map1.getOrDefault(ch , 0) + 1);
        }
        for(Map.Entry<Character,Integer> entry : map1.entrySet()) {
            if(entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }


}
