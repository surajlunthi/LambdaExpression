package lambda.sec2;

public class IncBy5Impl {
    public static void main(String[] args) {

        IncrementNumberBy5 incrementNumberBy5 = (a)-> {
            return a+5;
        };

    System.out.println(incrementNumberBy5.incrementBy5(2));


    }

}

