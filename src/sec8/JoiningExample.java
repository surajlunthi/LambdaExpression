package sec8;

// what  does the Joining do it does concatenates the element into string , when encountered

// Stream.of("E","F","G,"H") --> EFGH
// it concatenates the input element into string  with delimiter , in encounter order

// joining()
// joining(charSequence , delimiter)
// joining(charSequence delimiter,charSequence prefix,charSequence suffix)

import sec3.Instructors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {

    public static void main(String[] args) {

        String result = Stream.of("E","F","G","H").collect(Collectors.joining());
        String result1 = Stream.of("E","F","G","H").collect(Collectors.joining(","));
        String result2 = Stream.of("E","F","G","H").collect(Collectors.joining(",","*","*"));

        System.out.println(result2);


        // instructors name seperated by ',' and prefix "{" and suffix "}"

        String instructorNames = Instructors.getAll().stream()
                .map(instructor -> instructor.getName())
                .collect(Collectors.joining(",","{","}"));


        System.out.println(instructorNames);
    }
}
