package sec6;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,94,5,6);

        Optional result =  numbers.stream().reduce((a,b)->a>b?a:b);
        Optional result1 = numbers.stream().max(Integer::compareTo);

        System.out.println(result1.get());
        System.out.println(result.get());
    }
}
