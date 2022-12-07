package sec3;

import java.util.List;

public class Instructors {

    public static List<Instructor> getAll()
    {
    Instructor instructor1 = new Instructor("suraj",1,"SDE","M",
        true,List.of("Java","C++"));

    Instructor instructor2 = new Instructor("Sammer",20,"SDE","M",
                true,List.of("Python","C++"));

    Instructor instructor3 = new Instructor("Shivam",11,"SDE","M",
                true,List.of("Java","C++"));

    Instructor instructor4 = new Instructor("Stuti",1,"SDE","F",
                false,List.of("Ruby","Angular"));

    return List.of(instructor1,instructor2,instructor3,instructor4);

    }

}

