package sec10;

public class CalculatorImpl implements Calculator {
    @Override
    public int sum(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return Calculator.super.subtract(num1, num2);
    }

    public static void main(String[] args) {

        CalculatorImpl calculator = new CalculatorImpl();

        System.out.println(calculator.sum(2,3));
        System.out.println(Calculator.multiply(2,3));


    }
}
