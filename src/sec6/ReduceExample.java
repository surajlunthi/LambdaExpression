package sec6;

// Reduce is the repeated process of combining all elements
// it takes input of elements and combines them into single result by repeated application of combining operations

import sec3.Instructor;
import sec3.Instructors;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        int result = numbers.stream()
                // what does identity operator does in this
                // it acts as first element when there is no element in stream
                // 1+0 = 1
                // 2+1 = 3
                .reduce(0,(a,b)->a+b);

        int resultsMultiply = numbers.stream().reduce(1,(a,b)->a*b);
//
//        System.out.println(result);
//        System.out.println(resultsMultiply);

// second method no need of providing identity operator

        Optional result2 = numbers.stream().reduce((a, b)->a+b);

        System.out.println(result2.get());


//  printing the name of the instructor who has the highest year of experience

        Optional<Instructor> instructor = Instructors.getAll().stream()
                                          .reduce((s1,s2)->{
                                            if(s1.getYearsOfExperience()>s2.getYearsOfExperience())
                                                return s1;
                                            else
                                                return s2;
                                          });

        System.out.println(instructor.get());

























    }
}
