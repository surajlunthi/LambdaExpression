package sec10;

public interface InterfaceA {

    default void sumA(int num1,int num2){
        System.out.println("Sum of interface A"+num1+num2);
    }
}
