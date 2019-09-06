import apcslib.*;
import java.awt.Color;
import chn.util.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Main
{
    public static void main(){
        ConsoleIO io = new ConsoleIO();
        
        Jared jaredObject = new Jared();
        Cory coryObject = new Cory();
        Dana danaObject = new Dana();
        Ethan ethanObject = new Ethan();
        
        String input;
        String repeat = "y";
        

        System.out.print("Please select a member: ");
        input = io.readLine();
        
        switch(input)
        {
             case "ethan":
             case "Ethan":
                ethanObject.main();
                break;
             case "jared":
             case "Jared":
                jaredObject.main();
                break;
             case "dana":
             case "Dana":
                danaObject.main();
                break;
             case "cory":
             case "Cory":
                coryObject.main();
                break;
             default:
                System.out.println("Error");
        }
    }
    }

