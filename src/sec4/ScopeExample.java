package sec4;

import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class ScopeExample {

    // body of lambda expression has the same scope as nested block
    // you can not declare parameter or local  variable in thg lambda that has same name as local variable
    // you can not modify the local variable inside lambda expression

    // in, lambda you are allowed to use local variable but we cant modify if the value oif local variable

    public static void main(String[] args) {

        int a = 10;

    }
}
