package sec3;

import java.util.function.UnaryOperator;

// unaryOperator Extends Function , and it takes single parameter and return the same type
public class UnaryOperatorInterface {

    public static void main(String[] args) {

        UnaryOperator<Integer> unaryOperator = i ->i*10;
        System.out.println(unaryOperator.apply(10));



    }

}
