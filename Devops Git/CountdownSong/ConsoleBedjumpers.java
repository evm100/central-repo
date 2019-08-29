
/**
 * Basics for programming in Java
 *
 * @author (John Mortensen)
 * @version (a version number or a date)
 */

import chn.util.*;   //Import

public class ConsoleBedjumpers
{ // everything in Java is a class, we will learn more latter
    
    public static void main()
    { // code blocks are in curly braces {}
        // initialise control variables for program
        ConsoleIO keyboard = new ConsoleIO();
        int countdown;                 // integer variable assignment, statements end in semi colon
        String bedJumpers;
        
        //Get User Input
        System.out.println("Enter the bedjumpers: ");
        bedJumpers = keyboard.readLine();
        System.out.println("Enter the number of jumps: ");
        countdown = keyboard.readInt();

        // prepare for countdown loop
        String space = " ";
        while (countdown > -1) { // while is a control flow statement, observe blocks of code

            if (countdown == 0) { // if and else are control flow statments
                // last message
                System.out.println("Zero little" + space + bedJumpers + "s");
            } else {
                // messages print each time through loop,  println prints a line to console, plus sign (i + space...) concatonates
                System.out.println(countdown + space + "little" + space + bedJumpers + "s" + space + "jumping on the bed");
                System.out.println("One fell off and broke his head");
                System.out.println("Mama called the doctor and the doctor said");
                System.out.println("no more" + space + bedJumpers + "s" + space + "jumping on the bed.");
            }
            
            // decrement i at end of loop
            countdown--;  // this is equivalent to i = i - 1, -- is a shorthand
            
        }    
    }
    
}