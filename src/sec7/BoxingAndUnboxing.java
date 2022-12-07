package sec7;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingAndUnboxing {

    // converting a primitive value into an object of wrapper class is called  boxing int to Integer
    // converting an object of wrapper class to its primitive type is called unboxing  Integer to int

    public static void main(String[] args) {

        List<Integer> numbers ;

        IntStream intStream = IntStream.rangeClosed(1,1000);
        numbers = intStream.boxed().collect(Collectors.toList());

        Optional<Integer> sum = numbers.stream().reduce((a,b)->a+b);
        System.out.println(sum.get());

        int sum1 = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum1);

    }


}
