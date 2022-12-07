package sec8;

// Collectors class Mapping() method takes a function and another collector and creates a new collector 
// which apply the function and then collects the mapped elements using the given collector

import sec3.Instructor;
import sec3.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MappingExample {
    public static void main(String[] args) {

        List<String> namesList = Instructors.getAll().stream() 
                                 .map(Instructor::getName)
                                 .collect(Collectors.toList());

        System.out.println("namesList = " + namesList);
        
        namesList = Instructors.getAll().stream()
                    .collect(Collectors.mapping(Instructor::getName,Collectors.toList()));

        System.out.println("namesList = " + namesList);
        
        
        // Instructors by their years of experience 
        
       Map<Integer,List<String>> listMap = Instructors.getAll()
                .stream()
                .collect(Collectors.groupingBy(Instructor::getYearsOfExperience,Collectors.mapping(Instructor::getName,Collectors.toList())));
       
       listMap.forEach((key,value)-> System.out.println(key +" "+value));
    }
}
