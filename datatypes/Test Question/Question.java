
/**
 * Write a description of class Question here.
 *
 * @author (kevin shihora)
 * @version (01)
 */
import java.util.Scanner;
public class Question
{
    public static void main()
    {
    System.out.println("Which one of these are not a primitive data type?");
    System.out.println("1: int");
    System.out.println("2: array");
    System.out.println("3: char");
    System.out.println("4: boolean");
    Scanner s = new Scanner(System.in);
    System.out.print("Please input the number you think is the answer: ");
    int num = s.nextInt();
    
    switch(num)
    {
        case 1: 
                System.out.println("Incorrect");
                break;
        case 2:
                System.out.println("Correct");
                break;
        case 3:
                System.out.println("Incorrect");
                break;
        case 4:
                System.out.println("Incorrect");
                break;
    }
}
    
    
    
    
    
    
    
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Question
     */
    public Question()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
