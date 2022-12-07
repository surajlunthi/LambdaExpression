package sec3;

// java supplier interface is a functional interface that supplies a value of some type
// supplier interface can also be thought of factory interface

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> (int) (Math.random()*1000);

        System.out.println(supplier.get());

    }
}
