package sec6;

import sec3.Instructor;
import sec3.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStreamExample {

    // Stream filter predicate returns a stream of elements matching the given predicate
    // the operation is lazy meaning filter does not actually perform any filtering but instead creates a new stream ,
    // that when traversed contains the elements of the stream that matched with the predicate


    public static void main(String[] args) {

        List<Instructor> instructors =   Instructors.getAll().stream()
                                         .filter(instructor -> instructor.getYearsOfExperience()>10)
                                         .collect(Collectors.toList());

        instructors.forEach(instructor -> System.out.println(instructor));


    }
}
