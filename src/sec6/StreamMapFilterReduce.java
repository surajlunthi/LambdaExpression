package sec6;

import sec3.Instructor;
import sec3.Instructors;

import java.util.Optional;

public class StreamMapFilterReduce {

    public static void main(String[] args) {

        // total years of experience between instructors

        Optional<Integer> values = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourses)
                .map(Instructor::getYearsOfExperience)
                .reduce((i1,i2)->i1+i2);


        System.out.println(values.get());

    }
}
