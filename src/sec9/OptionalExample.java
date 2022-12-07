package sec9;

import java.util.Optional;

public class OptionalExample{
    
    // to avoid null pointer exception java 8 has introduced optional class in java.util.package to avoid null checks 

    public static void main(String[] args) {
        
        Integer [] integers = new Integer[10];

        Optional<Integer> number = Optional.ofNullable(integers[1]);
        
        if(number.isPresent())
        {
            System.out.println("present");
        }
        else
            System.out.println(Optional.empty());
        
        // Optional.of(null); // we must provide value otherwise if null ,it will throw null pointer exception
        
        
        // Optional.orElse if value present then value or else it gets value from orElse(providedValue)
        
        integers[0] = 1;
         number = Optional.ofNullable(integers[1]);
        int result = number.orElse(-1);

        System.out.println("result = " + result);
        
        result = number.orElseGet(()->-1);
        System.out.println("result = " + result);
        
        // orElseThrow throws exception 

        // isPresent vs ifPresent 
        
        
        
        // isPresent 
        Optional<String> stringOptional = Optional.ofNullable("Hello world");
        if(stringOptional.isPresent())
            System.out.println("stringOptional = " + stringOptional.get());
        
        stringOptional.ifPresent((value)-> System.out.println("value = " + value));





    } 
}
