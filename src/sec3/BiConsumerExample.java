package sec3;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    // its same as consumer it takes two arguments and process it but doest return anything

    public static void main(String[] args) {

        // printing two numbers
        BiConsumer<Integer ,Integer> c1 = (x,y)-> System.out.println(x+" "+y);
        c1.accept(2,3);

        // adding two numbers
        BiConsumer<Integer ,Integer> c = (x,y)-> System.out.println(x+y);
        c.accept(2,3);

        //concatenate two strings
        BiConsumer<String,String> c3 = (x,y)->System.out.println(x+y);
        c3.accept("suraj","Lunthi");
    }


}
