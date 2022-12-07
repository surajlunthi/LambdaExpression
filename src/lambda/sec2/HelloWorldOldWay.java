package lambda.sec2;

public class HelloWorldOldWay implements Helloworld {
    @Override
    public String sayHelloworld() {
       return "Hello World";
    }

    public static void main(String[] args) {
        HelloWorldOldWay helloWorldOldWay = new HelloWorldOldWay();
        System.out.println(helloWorldOldWay.sayHelloworld());
    }
}
