package sec6;

import sec3.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    public static void main(String[] args) {

        // get a list of all the courses which instructor offered

        List<String> coursesOffered =  Instructors.getAll().stream()
                                      .map(instructor -> instructor.getCourses())
                                      .flatMap(list->list.stream())
                                      .collect(Collectors.toSet())
                                      .stream().collect(Collectors.toList());

        coursesOffered.forEach(course->System.out.println(course));


    }
}
