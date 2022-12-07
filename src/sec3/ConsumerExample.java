package sec3;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

//  consumer  which acts as action and consumer.accepts() is called when looping through for each

        List<Instructor> instructors = Instructors.getAll(); // will return the list that we created

// case 1    Looping through all the instructors and printing out the values of instructors

        Consumer<Instructor> c1 = instructor -> System.out.println(instructor);

        Consumer<Instructor> c2 = instructor -> System.out.println(instructor.getName());

        Consumer<Instructor> c3 = instructor -> System.out.println(instructor.getName()+"  "+
                instructor.getCourses());



//  for each accepts a consumer ,c1 is a consumer which prints the value of instructor
        instructors.forEach(c1);

//  case 2 loop through all the instructor and print only their name
        instructors.forEach(c2);

//  case 3 loop through all the instructor and printout their names and their courses
        instructors.forEach(c3);

// case 4 loop through all the instructors and print out their name if years of experience is > 10

        instructors.forEach( consumer -> {
            if(consumer.getYearsOfExperience()>10)
                c2.accept(consumer);
        });




    }
}
