package sec6;

import sec3.Instructor;
import sec3.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomizedSortComparatorExample {

    public static void main(String[] args) {

        // returning all instructors sorted by name

        List<Instructor> list =  Instructors.getAll().stream()
                                 .sorted(Comparator.comparing(Instructor::getName))
                                 .collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}
