import java.util.Scanner;
import java.lang.Math.*;


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        return (angle %= 360) >= 0 ? angle : (angle + 360);
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        return Math.floorMod(integer, 360);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        NormalizeAngle nAngle = new NormalizeAngle();
        Integer inputAngle;
        
        System.out.println("Input an integer for the angle (positive or negative.)");
        inputAngle = input.nextInt();
        
        int modAngle = nAngle.normalizeValueUsingModulo(inputAngle);
        int floorAngle = nAngle.normalizeValueUsingModulo(inputAngle);
        
        System.out.println("The angle " + inputAngle);
        System.out.println("The normalized angle using mod is " + modAngle);
        System.out.println("The normalized angle using floor is " + modAngle);
    }
}
