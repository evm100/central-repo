import java.util.Scanner;

public class KeyboardMonkeys
{  
    public static void main()
    {

        Scanner input = new Scanner(System.in);
        String bedJumpers = "";
        int i = 0;
        int dead = 0;
        String playAgain = "";
        
        //user wants to play
        boolean playing = true;
        while (playing == true)
        {
            
            //chose animal
            System.out.println("Chose an animal:");
            bedJumpers = input.nextLine();
            
            //infinite loop if not q
            while (1 == 1)
            {
                System.out.println("How many " + bedJumpers + "s?");
                if (input.hasNextInt())
                {
                    i = input.nextInt();
                    dead = dead + i;
                    break;
                } else
                {
                    System.out.println("That's not a number!");
                    input.next();
                }
            }
            
            while (1 == 1) 
            {
    
                if (i == 0) 
                {
                    System.out.println("Zero little " + bedJumpers + "s ");
                    break;
                } else 
                {
                    if (i == 1) {
                        System.out.println(i + " little " + bedJumpers + " jumping on the bed");
                    } else{
                        System.out.println(i + " little " + bedJumpers + "s jumping on the bed");
                    }
                    System.out.println("One fell off and broke his head");
                    System.out.println("Mama called the doctor and the doctor said");
                    System.out.println("no more " + bedJumpers + "s jumping on the bed!");
                }
                
                i--;  // this is equivalent to i = i - 1, -- is a shorthand
            }
            
            System.out.println("Animals killed: " + dead);
            
            //Asks if user wants to play again. Verifies yes or no answer
            while (1 == 1){
                System.out.println("Play again? yes or no.");
                playAgain = input.next();
                if (playAgain.length() == 3){
                    break;
                } else if (playAgain.length() == 2){
                    playing = false;
                    System.out.println("Goodbye!");
                    break;                    
                }
                System.out.println("That's not an answer!");
            }
        }
    }
}
