
/**
 * Write a description of class start here.
 *
 * @author Phoenix Dimagiba
 * @version 09/03/19
 */
public class Start
{
    // instance variables - replace the example below with your own
    private int errorCode;

    /**
     * Constructor for objects of class start
     */
    public Start()
    {
        // initialise instance variables
        errorCode = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        // put your code here
        System.out.println("\u000C\nHello, World! In main");
        
        FirstClass first = new FirstClass();
        first.askQuestion();
        
        SecondClass second = new SecondClass();
        second.askQuestion();
    }
}
