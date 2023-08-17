package zehra;

import java.util.Arrays;
import java.util.stream.Stream;

public class NoDuplicate {

    public static void main(String[] args) {

        int[] numbers = {3, 2, 1, 1, 2}; // Example array

        Stream<Integer> uniqueNumberStream = Arrays.stream(numbers)
                .distinct()
                .filter(num -> num == 1 || num == 2) // Change the filter condition
                .boxed(); // Convert int to Integer for stream

        uniqueNumberStream.forEach(System.out::println);

    }
}
// if you have array 3,2,1,1,2 and you have to do stream and no duplicate output 1,2
