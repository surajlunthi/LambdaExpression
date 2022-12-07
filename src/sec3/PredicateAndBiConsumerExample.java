package sec3;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumerExample {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        Predicate<Instructor> p1 = instructor -> instructor.isOnlineCourses();
        Predicate<Instructor> p2 = instructor -> instructor.getYearsOfExperience()>10;

        // BiConsumer print name and courses

        BiConsumer<String,List> c = (name,list)-> System.out.println(name+" "+list);

    instructors.forEach(instructor -> {
        if(p1.and(p2).test(instructor))
             c.accept(instructor.getName(), instructor.getCourses());
        });

    }
}
