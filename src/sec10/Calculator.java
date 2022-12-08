package sec10;

@FunctionalInterface
public interface Calculator {

    // abstract sum method
    public int sum(int num1,int num2);

    default int subtract(int num1,int num2){
        return num1-num2;
    }
    static int multiply(int num1,int num2){
        return num1*num2;
    }


}
