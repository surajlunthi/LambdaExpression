package sec3;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();

        BiConsumer<String, String> biConsumer = (name, gender) -> System.out.println(name + " " + gender);

        instructors.forEach(instructor -> {
            biConsumer.accept(instructor.getName(),instructor.getGender());
        });

    // print out name and list of courses
        BiConsumer<String,List> biConsumer1 = (name,list)-> System.out.println(name+ " "+list);

        instructors.forEach(instructor -> {
            biConsumer1.accept(instructor.getName(),instructor.getCourses());
        });

     // print out the name of instructor who teaches online

        instructors.forEach(instructor -> {
            if(instructor.isOnlineCourses())
                biConsumer.accept(instructor.getName(),instructor.getGender());
        });

    }

}
