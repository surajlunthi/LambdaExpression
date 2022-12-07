package lambda.sec2;

import java.util.concurrent.Callable;
import java.util.stream.IntStream;

public class SumOfNumbeUsingCall {

    public static int[] array = IntStream.range(0,5000).toArray();
    public static int total = IntStream.range(0,5000).sum();

    public static void main(String[] args) {

        // callable return something
        //runnable doest not return anything

        Callable callable1 = ()->{
            int sum = 0;
            for(int i = 0;i<array.length;i++){
                sum+=array[i];
            }
            return sum;
        };
    }
}
