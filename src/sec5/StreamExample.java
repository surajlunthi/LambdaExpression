package sec5;

// a stream is a sequence of objects that supports various methods which can be pipelined to produce the desired results
// stream API is used to process collection of objects
// and give us lot of functionality


// stream does not change the original data structure from which it is constructed ,it only returns the result of pipeline
// each intermediate operation is lazily executed and return stream which can be pipelined for further operations
// parallel operations are easy to perform in stream


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4);

        // what we need to do is to calculate the square of numbers and get them into list
        List<Integer> square = list.stream().map(x->x*x).collect(Collectors.toList());

        System.out.println(square);

        List<String> names = List.of("Syed","mike","jenny","Rajeev");

        Predicate<String> p1 = value->value.startsWith("j");

        List<String> filteredListStartWithJ = names.stream().filter(name->p1.test(name)).collect(Collectors.toList());
        System.out.println(filteredListStartWithJ);

        // terminal operation on streams return a boolean or integer or collection
        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());

        // for each method is used to iterate over the stream





    }
}
