package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("RAM","SHYAM","BHANU","RAJU");

        Stream<String> stream  = names.stream().filter(name -> {
                    System.out.println("Filtering : " + name);
                    return name.length() > 3;
                });
        // This will get invoked first because

        // Intermediate operation are Lazy and they will get invoked when terminal operations are used
        System.out.println("Before Terminal Operation");

        List<String> filteredStream = stream.toList();
        System.out.println("After terminal operation");
        System.out.println(filteredStream);
    }
}
