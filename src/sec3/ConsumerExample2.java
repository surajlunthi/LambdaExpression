package sec3;

import java.util.function.IntConsumer;

public class ConsumerExample2 {

    public static void main(String[] args) {
        IntConsumer intConsumer = (a)->{
            System.out.println(a*10);
        };
        intConsumer.accept(8);
    }
}
