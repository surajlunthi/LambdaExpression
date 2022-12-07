package sec6;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class streamMinExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,45,6);

        Optional result = numbers.stream().min(Integer::compareTo);
        Optional result1 = numbers.stream().reduce((a,b)->a>b?b:a);

        System.out.println(result1.get());
        System.out.println(result.get());

    }
}
