
/**
 * Basics for programming in Java
 *
 * @author (John Mortensen)
 * @version (a version number or a date)
 */
import java.util.Scanner; // import the Scanner class 



public class CountdownSong
{ // everything in Java is a class, we will learn more latter
    
    public static void main()
    { // code blocks are in curly braces {}
        // initialise control variables for program
        int countdown = 20;  
       
        System.out.println("Enter your desired bed jumper:");
        Scanner myObj = new Scanner(System.in);
        String bedJumpers = myObj.nextLine();
        
        System.out.println("Enter your desired number of bed jumpers:");
    
        countdown = myObj.nextInt();
    
    
        // integrer variable assignment, statements end in semi colon
        //String bedJumpers = "monkeys";      // string of characters 

        // prepare for countdown loop
        int i = countdown;
        String space = " ";
        while (i > 0) { // while is a control flow statement, observe blocks of code

                // messages print each time through loop,  println prints a line to console, plus sign (i + space...) concatonates
                System.out.println(i + space + "little" + space + bedJumpers + space + "jumping on the bed");
                System.out.println("One fell off and broke his head");
                System.out.println("Mama called the doctor and the doctor said");
                System.out.println("No more" + bedJumpers + "jumping on the bed.");
            
            
            // decrement i at end of loop
            i--;  // this is equivalent to i = i - 1, -- is a shorthand
            
        }    
        System.out.println("Zero little" + space + bedJumpers);
    }

    
}
