package lambda.sec2;

import lambda.sec2.Helloworld;

public class HelloWorldNewWay {
    public static void main(String[] args) {

        Helloworld helloWorldInterface = ()-> "hello world";

        System.out.println(helloWorldInterface.sayHelloworld());
    }

}
