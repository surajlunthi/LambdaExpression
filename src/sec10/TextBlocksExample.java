package sec10;

public class TextBlocksExample {

    public static void main(String[] args) {
        
        String str1 = """
                    hello world
                    Using
                    textBlocks""";

        System.out.println("str1 = " + str1);
        
        String phrase = """
               {
               employee:"Mike",
               employee:1001;
               employeeType:FT
               }""";

        System.out.println("phrase = " + phrase);
    }
}
