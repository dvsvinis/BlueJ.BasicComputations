 import java.util.Scanner;


public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        return (Integer.toBinaryString(value));
    }

    public String printIntegerAsOctal(int value){
        return (Integer.toOctalString(value));
    }

    public String printIntegerAsHexadecimal(int value){
        return (Integer.toHexString(value));
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        IntegerPrinter intPrinter = new IntegerPrinter();
        int inputNumber;
        System.out.println("Input an integer.");
        inputNumber = input.nextInt();
        
        String binaryNumber = intPrinter.printIntegerAsBinary(inputNumber);
        String octalNumber = intPrinter.printIntegerAsOctal(inputNumber);
        String hexNumber = Integer.toHexString(inputNumber);
        
        System.out.println("The number " + inputNumber );
        System.out.println("In binary it is: " + binaryNumber);
        System.out.println("In octal it is: " + octalNumber);
        System.out.println("In hexidecimal it is: " + hexNumber);
    }
}
