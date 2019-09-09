import apcslib.*;
import chn.util.*;
import java.util.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Quadratic
{
   public static void main(){
       double a, b, c;
       double root1, root2;
       ConsoleIO input = new ConsoleIO();
       
       
       //Getting user input for values
       System.out.print("Please enter an 'a' value: ");
       a = input.readDouble();
       
       System.out.print("Please enter a 'b' value: ");
       b = input.readDouble();
       
       System.out.print("Please enter a 'c' value: ");
       c = input.readDouble();
       
       
       //performing calculations
       
       //First root calculation
       root1 = (-b + Math.sqrt((b * b) - 4 * a * c)) / (2.0 * a);
       
       //Second root calculation
       root2 = (-b - Math.sqrt((b * b) - 4 * a * c)) / (2.0 * a);
       
       System.out.printf("First root is %.2f\n", root1);
       System.out.printf("Second root is %.2f\n", root2);
    }
}
