import chn.util.*;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Main
{
    public static void Main()
    {
        ConsoleIO input = new ConsoleIO();
        
        int sel;
        int rep = 1;
        while(rep == 1)
        {
                
            System.out.println("Please select a program to run: ");
            System.out.println("1.) Quadratic ");
            System.out.print("?.) ");
            sel = input.readInt();
            
            switch(sel){
                case 1:
                    Quadratic quadraticObject = new Quadratic();
                    quadraticObject.main();
                    break;
                    
            }
            
            System.out.println("Would you like to run another program? [0/1]");
            System.out.print("?.) ");
            rep = input.readInt();
        }
    }
}
