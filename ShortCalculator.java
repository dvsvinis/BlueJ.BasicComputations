 import java.util.Scanner;
 

public class ShortCalculator {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ShortCalculator shortCalc = new ShortCalculator();
        short input1;
        short input2;
        int result;
        
        System.out.println("Input an integer between 0 and 65535.");
        input1 = input.nextShort();
        System.out.println("Input a second integer between 0 and 65535.");
        input2 = input.nextShort();
        
        //sum, difference, product, quotient, and remainder
        result = Math.abs(input1 + input2);
        System.out.println("The sum is: " + result);
        
        
    
    
    }
}