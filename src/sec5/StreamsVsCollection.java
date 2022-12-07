package sec5;

import java.util.ArrayList;
import java.util.List;

// difference between collection and streams

public class StreamsVsCollection {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("Syed");
        names.add("rajeev");

        System.out.println(names);
        System.out.println("------");

        names.remove("Syed");

        System.out.println(names);
        System.out.println("------");

    for(String name: names){
            System.out.println(name);
    }


       names.stream();


    }

}
