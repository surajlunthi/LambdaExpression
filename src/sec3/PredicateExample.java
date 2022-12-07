package sec3;

// predicate is a single argument function which returns true or false
// predicate has test methods which return true or false

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

//  case 1  if number is greater than > 10  we will return true
        Predicate<Integer> p1 = (i) -> i>10;

         System.out.println( p1.test(40)); // should return true as value > 10
         System.out.println( p1.test(4));  // should return false as value < 10


//  case 2 should return true for even numbers
         Predicate<Integer> p2 = (i)-> i%2 == 0;

        System.out.println(p2.and(p1).test(41));  // return false
        System.out.println(p2.or(p1).test(41));   // return true because satisfy one of the given case condition for OR




    }
}
