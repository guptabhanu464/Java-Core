package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {


        HashMap<Integer , String> map = new HashMap<>();
        map.put(1,"Bhanu");
        map.put(2,"Radhe");
        map.put(3,"Bhanu");
        map.put(4,"Shyam");
        map.get(1);
        System.out.println(map.hashCode());

        Set<Integer> integers = map.keySet(); // This will Give me all the keys
        // As keys are unique that is why set is provided
        for(int i : integers) {
     //       System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet(); // Now this will give me all the values

        for(Map.Entry<Integer, String> entry: entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue().toUpperCase());
        }
        //System.out.println(map);
    }
}
