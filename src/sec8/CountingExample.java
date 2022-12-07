package sec8;

// Counting the number of elements in the stream
// Stream.of(1,2,3,4,5,6).collect(Collectors.counting())

import sec3.Instructor;
import sec3.Instructors;

import java.util.stream.Collectors;

public class CountingExample {

    public static void main(String[] args) {

 // count the number of instructors who teaches online

        long countOfInstructors = Instructors.getAll()
                                 .stream().filter(Instructor::isOnlineCourses)
                                 .count();
        System.out.println("countOfInstructors = " + countOfInstructors);
        
       long countOfInstructors1 = Instructors.getAll().stream()
                                 .filter(Instructor::isOnlineCourses)
                                  .collect(Collectors.counting());

        System.out.println("countOfInstructors1 = " + countOfInstructors1);

    }
}
