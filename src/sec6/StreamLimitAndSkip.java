package sec6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitAndSkip {

    public static void main(String[] args) {


// limit (log n ) it takes long as argument and returns a stream of size no more than n
//  skip (log n) it takes one long (n) as an argument and skip after removing first n element

         List<Integer> listNumbers = Arrays.asList(1,2,3,4,5,6,7);

         List<Integer> nums =  listNumbers.stream().skip(2).limit(5).collect(Collectors.toList());

         System.out.println(nums);

    }
}
