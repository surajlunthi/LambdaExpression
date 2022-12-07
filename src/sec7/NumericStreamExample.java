package sec7;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamExample {

    public static void main(String[] args) {

        // sum
        int sum = IntStream.rangeClosed(0,1000).sum();
        System.out.println(sum);

        // min
        OptionalInt min = IntStream.rangeClosed(0,1000).min();
        System.out.println(min);

        //max
        OptionalInt max = IntStream.rangeClosed(0,1000).max();
        System.out.println(max);



    }
}
