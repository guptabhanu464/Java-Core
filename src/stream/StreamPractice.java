package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        // Find max from elements

        List<Integer> list = Arrays.asList(10, 29, 30, 45, 90);

        Integer max = list.stream().max(Integer::compareTo).orElseThrow();
     //   System.out.println(max);


        // Sort things in reverse order
        List<String> strings = List.of("cherry", "apple", "banana");
        List<String> list1 = strings.stream().sorted(Comparator.naturalOrder()).toList(); // Comparator natural order // Alphabetically
        List<String> list2 = strings.stream().sorted(Comparator.reverseOrder()).toList(); // Comparator reverse order // Revers Alphabetically
      //  System.out.println(list1);
       // System.out.println(list2);

        List<List<Integer>> integers = List.of(List.of(1, 2), List.of(3, 4), List.of(5));
        List<Integer> list3 = integers.stream().flatMap(List::stream).toList();
        // System.out.println(list3);

        // Remove duplicates from List
        List<Integer> integers1 = List.of(1, 2, 2, 2, 3, 4, 5, 5);
        List<Integer> list4 = integers1.stream().distinct().toList();
        //System.out.println(list4);

        // Group Words by their length
        List<String> stringList = List.of("cat", "Dog", "elephant");
       // System.out.println(stringList.stream().map(String::toUpperCase).collect(Collectors.groupingBy(String::length)));

        // Find second highest number in list
        List<Integer> integers2 = List.of(20, 10, 50, 70);
        Integer i = integers2.stream().sorted().skip(2).findFirst().orElseThrow();
       // System.out.println(i);

        // Partition into even and odd groups
        List<Integer> integers3 = List.of(1, 2, 3, 4, 5);
      //  System.out.println(integers3.stream().collect(Collectors.partitioningBy(x -> x % 2 ==0)));


        List<String> a = List.of("A", "B", "C");
        String collect = a.stream().collect(Collectors.joining(" ,"));
       // System.out.println(collect);

        String s = "programming";
        //char[] charArray = s.toCharArray();
        Map<Character, Long> collect1 = s.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    //     System.out.println(collect1);

        // Find sum of square of even number in list
        List<Integer> integers4 = List.of(20, 23, 24, 89, 90);
       // System.out.println(integers4.stream().filter(x-> x % 2 ==0).map(n -> n*n).reduce(Integer::sum).orElseThrow());

     //






    }
}
