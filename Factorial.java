 
import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger f = new BigInteger("1");
        for (int i = 1; i <= value; i++) {
            f = f.multiply(BigInteger.valueOf(i)); 
        }
        return f; 
    } 
    public static void main(String args[]) throws Exception 
    { 
        Integer number = 1000; 
        Factorial factorial = new Factorial();
        
        System.out.println("The factorial of " + number + ": " + factorial.factorialOf(number));
        
    } 
} 
 