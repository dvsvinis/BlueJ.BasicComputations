 import java.util.Scanner;
 import java.util.Arrays;
 import java.lang.Math; 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        Integer max = integers[0];
        for(int i = 0; i < integers.length; i++)
        {
            if(max < integers[i])
            {
                max = integers[i];
            }
       }
       return max;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        Integer max = integers[0];
        for(int i = 0; i < integers.length; i++)
        {
            max = Math.max(max, integers[i]);
       }
       System.out.println("Largest is :" + max);
       return max;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        LargestInteger largest = new LargestInteger();
        int size = 3;
        Integer[] inputs = new Integer[size];
        
        for (int i = 0; i < size; i++){
            System.out.println("Input an integer ");
            inputs[i] = input.nextInt();
    }
    
        Integer largestInput = largest.findLargestNumberUsingConditional(inputs);
        Integer largestMaxInput = largest.findLargestNumberUsingMathMax(inputs);
        
        System.out.println("The largest input using Conditional: " + largestInput);
        System.out.println("The largest input using Max: " + largestMaxInput);
    
    }
}
