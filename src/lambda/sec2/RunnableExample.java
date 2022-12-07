package lambda.sec2;

public class RunnableExample {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int s = 0;

                for(int i = 0;i<10;i++)
                {
                    s+=i;
                }
                System.out.print(s);
            }
        };

       // new Thread(runnable).start();
        // implement using lambda expression

        Runnable runnable1 = ()->{
            int s = 0;

            for(int i = 0;i<10;i++)
            {
                s+=i;
            }
            System.out.print(s);
        };

        new Thread(runnable1).start();
    }
}
