package sec8;

import sec3.Instructor;
import sec3.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {

    public static void main(String[] args) {
        
        List<String> strings = List.of("Syed","Mike","Jenny","Gene","Rajeev");
        
        Map<Integer, List<String>> mapNameLength = strings.stream().collect(Collectors.groupingBy(String::length));

        mapNameLength.forEach((k,v)-> System.out.println(k+" "+v));

       Map<String,List<Instructor>> mapInstructorGender = Instructors.getAll().stream().collect(Collectors.groupingBy(
               Instructor::getGender));

       mapInstructorGender.forEach((key,value)-> System.out.println(key+" "+value));
       
     // groupingBy(classifier ,downstream)  
        
        Map<Integer,List<String>> result =  strings.stream()
                                            .collect(Collectors.groupingBy(String::length
                                            ,Collectors.filtering(s->s.contains("e"),Collectors.toList())));

        System.out.println("result = " + result);

        Map<String,List<Instructor>> instructorByExpAndOnline =  Instructors.getAll().stream()
                                                                 .collect(Collectors
                                                                 .groupingBy(instructor->instructor
                                                                  .getYearsOfExperience()>10?
                                                                 "Senior":"Junior",Collectors.filtering(
                                                                 Instructor::isOnlineCourses,Collectors.toList())));

       instructorByExpAndOnline.forEach((key,value)-> System.out.println(key+" "+value));



       
    }
}
