package sec6;

// Map is an intermediate operation and return another stream as method output value
// Map method is used when we need to convert stream X to stream Y

// NOTE map in stream is different from Collectors.toMap() , "Collectors.toMap()" gives us hash map

import sec3.Instructors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static void main(String[] args) {

        List<Integer> number =  Arrays.asList(2,3,4,5,6);
        List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());

        System.out.println(square);

        // case is to get only instructor names from the instructor list

        List<String> names = Instructors.getAll().stream()
                              .map(instructor -> instructor.getName())
                              .map(name->name.toUpperCase())
                              .collect(Collectors.toList());

        System.out.println(names);

    }

}
