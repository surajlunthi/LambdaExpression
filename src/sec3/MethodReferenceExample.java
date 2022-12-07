package sec3;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {



    public static void main(String[] args) {

        Predicate<Instructor> p1 = Instructor::isOnlineCourses;
    }
}
