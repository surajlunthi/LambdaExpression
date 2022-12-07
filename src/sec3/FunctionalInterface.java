package sec3;

// functional interface in java is an interface that contains single abstract method which is unimplemented

// a functional interface can contain default and static methods which do have an implementation in addition to single
// unimplemented method


// java consumer


import java.util.function.Consumer;

public class FunctionalInterface {

    public static void main(String[] args) {

        Consumer<String> c= (x)->System.out.println(x.length());
        c.accept("Up in the air ");

        Consumer<Integer> d = (x)-> System.out.println(x*x);
        d.accept(5);

    }
}
