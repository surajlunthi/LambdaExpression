package sec6;

import sec3.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class OperatorsStreamExample {

// distinct method to filter or collect all distinct elements form collection
// count return the count of elements in the stream
// sorted stream consisting of the elements of this stream ,sort according to natural order


// anyMatch returns that whether any elements of this stream match the provided predicate
// all match returns whether any elements of the stream match the provided predicate or not
//  no match returns whether no element of the stream match with provided predicate or not

    public static void main(String[] args) {

        // count example

        long coursesOfferedCount=  Instructors.getAll().stream()
                .map(instructor -> instructor.getCourses())
                .flatMap(list->list.stream())
                .collect(Collectors.toList())
                .stream().count();

        // distinct
        long coursesOfferedDistinct=  Instructors.getAll().stream()
                .map(instructor -> instructor.getCourses())
                .flatMap(list->list.stream())
                .collect(Collectors.toList())
                .stream().distinct().count();

        System.out.println(coursesOfferedDistinct);
        System.out.println(coursesOfferedCount);

        // sorted
        List<String> coursesOffered =  Instructors.getAll().stream()
                .map(instructor -> instructor.getCourses())
                .flatMap(list->list.stream())
                .collect(Collectors.toList())
                .stream().distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(coursesOffered);

        // anyMatch allMatch and nonMatch


        boolean coursesOfferedAnyMatch =  Instructors.getAll().stream()
                .map(instructor -> instructor.getCourses())
                .flatMap(list->list.stream())
                .collect(Collectors.toList())
                .stream().distinct()
                .anyMatch(string->string.startsWith("A"));


        boolean coursesOfferedAllMatch =  Instructors.getAll().stream()
                .map(instructor -> instructor.getCourses())
                .flatMap(list->list.stream())
                .collect(Collectors.toList())
                .stream().distinct()
                .anyMatch(string->string.startsWith("A"));

        boolean coursesOfferedNoneMatch =  Instructors.getAll().stream()
                .map(instructor -> instructor.getCourses())
                .flatMap(list->list.stream())
                .collect(Collectors.toList())
                .stream().distinct()
                .anyMatch(string->string.startsWith("A"));


        System.out.println(coursesOfferedAnyMatch+" "+coursesOfferedAllMatch+" "+coursesOfferedNoneMatch);














    }

}