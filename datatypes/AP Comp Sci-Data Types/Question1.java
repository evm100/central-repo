import java.util.Scanner;
public class Question1
{
    public static void main(String [] args)
    
    {
        String q1 = "Which of the following is the preferred data type when creating variables with a numeric value?\n"
                     + "(a)long\n(b)short\n(c)int\n(d)byte";
        String q2 = "Which data type can you use when creating a variable with a fractional numeric value?\n"
                     + "(a)long\n(b)float\n(c)short\n(d)int";
        String q3 = "Which of the following data type stores numbers from -128 to 127?\n"
                     + "(a)long\n(b)byte\n(c)short\n(d)int";
        String q4 = "When using double, what do you have to end the value with?\n"
                     + "(a)f\n(b)r\n(c)d\n(d)l"; 
        String q5 = "Which of the following is a non-primitive data type?\n"
                     + "(a)int\n(b)byte\n(c)float\n(d)String"; 
             
                     
        Question [] questions = {
            new Question(q1, "c"),
            new Question(q2, "b"),
            new Question(q3, "b"),
            new Question(q4, "c"),
            new Question(q5, "d")
            
        };
        takeTest(questions);
    }
    public static void takeTest(Question [] questions) {
        int score = 0;
        Scanner x = new Scanner(System.in);
        
        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = x.nextLine();
            if(answer.equals(questions[i].answer)) {
                score++;
            }
        }
        System.out.println("You got " + score + "/" + questions.length);
        int i = x.nextInt();
            
        
        
  
    }
}
