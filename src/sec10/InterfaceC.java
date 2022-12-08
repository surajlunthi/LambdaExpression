package sec10;

public interface InterfaceC {
    default void sumC(int num1,int num2){
        System.out.println("Sum of interface C"+num1+num2);
    }
    default void sumA(int num1,int num2){
        System.out.println("Sum of interface A"+num1+num2);
    }
}
