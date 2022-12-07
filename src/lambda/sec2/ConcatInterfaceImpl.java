package lambda.sec2;

public class ConcatInterfaceImpl {

    public static void main(String[] args) {

        ConcatenateInterface concatenateInterface = (a,b) -> {
          return  a+b;
        };

     System.out.print(concatenateInterface.stringConcat("sudha ","sudhir"));
    }
}
