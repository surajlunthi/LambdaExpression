package sec7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MapToExample {

    // map to Obj () in a numeric stream returns a object valued stream
    // map to long it returns a longStream consisting of the result of given function
    // map to double it returns a Double stream consisting of the results of given function

    public static void main(String[] args) {

        List<RandomIds> randomIds = IntStream.rangeClosed(0,5)
                .mapToObj((i)->{
                    return new RandomIds(i,(int)Math.random());
                }).collect(Collectors.toList());

        randomIds.forEach(System.out::println);

        LongStream longStream = IntStream.rangeClosed(0,5).mapToLong(i->(long) i);
        System.out.println(longStream);

    }
}
class RandomIds{
    int id;
    int randomNumbers;

    public RandomIds(int id, int randomNumbers) {
        this.id = id;
        this.randomNumbers = randomNumbers;
    }

    @Override
    public String toString() {
        return "RandomIds{" +
                "id=" + id +
                ", randomNumbers=" + randomNumbers +
                '}';
    }
}
