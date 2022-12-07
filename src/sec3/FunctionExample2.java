package sec3;

// map of instructors with name and years of experience
// Function which will List<Instructors> and return Map<String,Integers>

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample2 {

    public static void main(String[] args) {

    Function<List<Instructor>, Map<String, Integer>> mapFunction = instructors ->{
    Map<String,Integer> map = new HashMap<>();
        instructors.forEach(
                instructor -> {
                    map.put(instructor.getName(),instructor.getYearsOfExperience());
                });
        return map;
        };

    System.out.println(mapFunction.apply(Instructors.getAll()));

    }
}
