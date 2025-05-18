package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {

        // OUTPUT -
        List<String> list = Arrays.asList("Spring", "Java", "Boot");
        List<String> list1 = list.stream().sorted(Comparator.comparingInt(String::length)).toList();
        //list1.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> collect = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        // collect.forEach(System.out::println);

        List<Integer> maxnumbers = Arrays.asList(5, 3, 8, 2);
        Integer integer = maxnumbers.stream().max(Integer::compareTo).orElse(-1);
        // System.out.println(integer);

    //    int[] arr = {1,2,3,4,5};
     //   int res = sum(arr,5);
      //  System.out.println(res);

        String s = "the sky is blue";
        String[] s1 = s.split(" ");
        System.out.println(Arrays.toString(s1));



    }



}

