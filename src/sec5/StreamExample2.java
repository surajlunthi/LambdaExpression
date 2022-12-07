package sec5;

import sec3.Instructor;
import sec3.Instructors;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;


// stream is not a data structure .it takes input from the collection and performs operations on them
// you can not add or delete from  streams are  iterated internally
public class StreamExample2 {

    public static void main(String[] args) {

        // creating a map of names and course of instructors who teaches online
        // Isonline and have more than 10 years of experience

        Predicate<Instructor> p1 = (i)-> i.isOnlineCourses();
        Predicate<Instructor> p2 = (i)-> i.getYearsOfExperience()>10;

        Map<String, List<String>> map = Instructors.getAll().stream()
                .filter(p1)
                .filter(p2)
                .collect(Collectors.toMap(instructor -> instructor.getName(),instructor -> instructor.getCourses()));

        System.out.println(map);


    }
}
