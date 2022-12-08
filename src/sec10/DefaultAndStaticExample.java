package sec10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// what problem with old interfaces logic is they must provide the implementation of those methods
// so java come up with the solution of default and static methods
// default methods is introduced in java 8 to add new methods in the existing interface so that they are backward
// compatible
//static methods are different in interfaces that we cannot override these methods inb the classes that
// implements these interfaces
public class DefaultAndStaticExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Mike","Syed","Jenny","Gene","Rajeev");

        names.sort(Comparator.naturalOrder());
    }
}
