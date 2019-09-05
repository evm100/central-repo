
/**
 * Write a description of class MC here.
 *
 * @author (José Corella)
 * @version (September 4, 2019)
 */

import chn.util.*;
public class TestConsoleIO 
 { 
    public static void main(String[] args)
    {
   
        // Declare the object and initialize with 
        // predefined standard input object 
      
        String answ; 
        ConsoleIO keyboard = new ConsoleIO();
        System.out.println("What library accesses ConsoleIO?");
        System.out.println("A) java.io ");
        System.out.println("B) java.math ");
        System.out.println("C) chn.util.* ");
        System.out.println("D) java.net ");
        
        System.out.println("Answer: ");
        answ = keyboard.readLine();
        
        if(answ.equals("c") || answ.equals("C"))
            System.out.println("Correct!");
        else
            System.out.println("Incorrect!");
            
        }
    }
    
           
        
 
  
         
  
   
        
    
  
   