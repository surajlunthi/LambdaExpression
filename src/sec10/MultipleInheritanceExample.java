package sec10;

public class MultipleInheritanceExample implements InterfaceA,InterfaceB,InterfaceC{

    public void sumA(int num1,int num2){
        System.out.println("Sum of interface A"+num1+num2);
    }
    public static void main(String[] args) {

        MultipleInheritanceExample multipleInheritanceExample = new MultipleInheritanceExample();

        multipleInheritanceExample.sumA(1,2);
        multipleInheritanceExample.sumB(3,4);
        multipleInheritanceExample.sumC(5,6);

    }



}
