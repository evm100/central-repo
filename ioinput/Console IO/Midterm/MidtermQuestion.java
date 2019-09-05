import chn.util.*;

public class MidtermQuestion {
    public static void main (String[] args) {
        int i = 1;
        System.out.println("To answer, type A, B, C, or D.");
        System.out.println();
        while (i == 1) {
            ConsoleIO console = new ConsoleIO(); //Creates a new ConsoleIO
            System.out.println("What line of code will print out \"Yeet\" when it is run?"); //Asks user a question
            System.out.println("A. system.out.printLn(\"Yeet\");");
            System.out.println("B. System.out.println(\"Yeet\");");
            System.out.println("C. System.out.printLn(\"Yeet\");");
            System.out.println("D. System.out.PrintLn (\"Yeet\");");
            String answer = console.readLine(); //Creates the string "name" based on their response
            answer = answer.toUpperCase();
        if (answer.equals("B")) {
            i = 2;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! Try again.");
        }
    }
}
}