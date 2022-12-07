package sec6;

import sec3.Instructor;
import sec3.Instructors;

import java.util.Optional;

public class FindFirstAndFindAnyExample {

    // findFirst it returns Optional object of stream containing first element of the stream , or any empty optional
    // if the stream is empty

    // find any it returns an optional object containing any one element of the stream or an empty
    // optional object if the stream is empty

    public static void main(String[] args) {

        Optional<Instructor> instructorOptional = Instructors.getAll().stream().findAny();

        if(instructorOptional.isPresent())
        {
            System.out.println(instructorOptional.get());
        }

        Optional<Instructor> instructorOptionalFirst = Instructors.getAll().stream().findFirst();

        if(instructorOptionalFirst.isPresent())
        {
            System.out.println(instructorOptional.get());
        }
    }

}
