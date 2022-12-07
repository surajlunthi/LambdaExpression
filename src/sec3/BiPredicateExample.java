package sec3;

import java.util.List;
import java.util.function.BiPredicate;

// BiPredicate takes two arguments
public class BiPredicateExample {

    public static void main(String[] args) {

        BiPredicate<Boolean,Integer> p1 = (isOnline,yearsOfExperience)-> isOnline && yearsOfExperience>10;

        List<Instructor> instructorList = Instructors.getAll();

    instructorList.forEach(instructor -> {

       if(p1.test(instructor.isOnlineCourses(),instructor.getYearsOfExperience()))
            {
                System.out.println(instructor.getName());
            }
        });
    }
}
