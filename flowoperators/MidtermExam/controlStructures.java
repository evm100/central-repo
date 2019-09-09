
/**
 * Asks our (control flow) question
 *
 * @author Eagan Kaminetz
 * @version 9/6
 */
public class controlStructures
{
    public boolean question1(){
        String[] answerKey = {"0 2 4 6 8", "0 2 4 6 8 "};
        GeneralFRQ question1 = new GeneralFRQ("What is the output for the following code when compiled and run? \n\npublic class forLoop{ \n   public static void main(String[] args){ \n      for(int i = 0; i<10; i=i+2){ \n         System.out.print(i+\" \"); \n      } \n   } \n}", answerKey);
        question1.askQuestion();
        return question1.getCorrectAnswerBool();
    
    }
}
