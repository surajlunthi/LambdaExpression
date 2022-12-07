package sec3;

import java.util.function.Consumer;
import java.util.function.Function;

// it is used to implement functional programming in Java
// it represents a function which take one argument and return the result
// to call the function we have to call apply
public class FunctionInterface {
    public static void main(String[] args) {

    Function<Integer,Double> sqrt = integer -> Math.sqrt(integer);

    Consumer<Integer> consumer = number -> System.out.println(sqrt.apply(number));
        consumer.accept(9);



    }

}
