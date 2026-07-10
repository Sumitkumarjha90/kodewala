package collection_day1_linkedhashset_stream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Driver2 {
    public static void main(String[] args) {

        String str = "swiss";

        Optional<Character> firstNonRepeating =
                str.chars()
                   .mapToObj(c -> (char) c)
                   .collect(Collectors.groupingBy(
                           Function.identity(),
                           LinkedHashMap::new,
                           Collectors.counting()))
                   .entrySet()
                   .parallelStream()
                   .filter(entry -> entry.getValue() == 1)
                   .map(Map.Entry::getKey)
                   .findFirst();

        System.out.println(firstNonRepeating.orElse(null));
    }
}
