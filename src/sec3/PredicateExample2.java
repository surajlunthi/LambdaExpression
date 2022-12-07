package sec3;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
    
    public static void main(String[] args) {

        List<Instructor> instructorList = Instructors.getAll();
        Predicate<Instructor> isOnlineInstructor = (instructor)->instructor.isOnlineCourses();

        // printing name of instructors who teaches online
        instructorList.forEach(instructor -> {
            if(isOnlineInstructor.test(instructor))
                System.out.println(instructor.getName());
        });
        
        
        
    }
}
