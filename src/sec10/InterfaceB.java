package sec10;

public interface InterfaceB {
    default void sumB(int num1,int num2){
        System.out.println("Sum of interface B"+num1+num2);
    }


}
