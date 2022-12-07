package sec8;

import sec3.Instructor;
import sec3.Instructors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxMinByExample {

    public static void main(String[] args) {

        //  collectors min by produces a minimal element according to given Comparator
        // Optional minBy (Comparator comparator)


        // Collectors.maxBy()  returns a Colector that produce the maximal element according to a given compartor
        // optional maxBy(Comparator comparator)
        
        // instructor with minimum years of experience 

    Optional<Instructor> instructor = Instructors.getAll().stream()
                                     .collect(Collectors.minBy(Comparator.comparing(Instructor::getYearsOfExperience)));

        System.out.println("instructor.get() = " + instructor.get());

        
    }
}
