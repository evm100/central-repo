
/**
 * Creates and asks FRQ questions based on args when constructing
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class GeneralFRQ
{
    //User's answer
    private String rawInput;
    //What gets asked
    private String questionText;
    //String array of acceptable answers
    private String[] acceptableAnswers;
    //1 or 0 depending on if answer is correct; int because math doesn't require conversions
    private int correctAnswer;
    //Tells program to ignore case if false
    private boolean caseSensitive;
    //How many times the question has been answered
    private int questionAnswered;
   
    //if params want to be added in later for some reason
    public GeneralFRQ(){
        caseSensitive = false;
    }
    //constructer that assumes case insensitivity for those precious five keystrokes
    public GeneralFRQ(String qT, String[] aA){
        rawInput = "";
        questionText = qT;
        acceptableAnswers = aA;
        questionAnswered = 0;
        caseSensitive = false;
    }
    //constructer that lets you specify case sensitivity
    public GeneralFRQ(String qT, String[] aA, boolean cS){
        rawInput = "";
        questionText = qT;
        acceptableAnswers = aA;
        questionAnswered = 0;
        caseSensitive = cS;
    }

    /**
    * Asks question with given question text, acceptable answers, and case sensitivity.
    * Writes to correctAnswer 1 or 0 for right or wrong
    * Increments questionAnswered
    */
    public void askQuestion()
    {
        //Asks question and brings up console prompt
        System.out.println(questionText);
        Scanner sc = new Scanner(System.in);
        rawInput = sc.nextLine();
        //Compares answer to key according to case sensitivity; if answer is right, correctAnswer = 1
        if(caseSensitive){
            for(String thisAnswer : acceptableAnswers){
                if(rawInput.equals(thisAnswer)){
                    //correctAnswer increments per time the question is right in case someone asks it multiple times
                    correctAnswer++;
                    break;
                }
        }
     
        } else {
         
            for(String thisAnswer : acceptableAnswers){
                if(rawInput.equalsIgnoreCase(thisAnswer)){
                    //correctAnswer increments per time the question is right in case someone asks it multiple times
                    correctAnswer++;
                    break;
                }
    }
    
    }
    questionAnswered++;
    }
    /**
    * Asks question, but only if it has not been answered before (or questionAnswered = 0)
    */
    public void askQuestionNoRepeats(){
    if(questionAnswered > 0) {
    askQuestion();
    questionAnswered++;
    }
    }
    
    public void changeQuestionText(String qT){
        questionText = qT;
    }
    
    public void changeAcceptableAnswers(String[] aA){
        acceptableAnswers = aA;
    }
    
    public void changeCaseSensitivity(boolean cC){
        caseSensitive = cC;
    }
    
    public void changeQuestionAnswered(int qA){
        questionAnswered = qA;
    }
    
    public String getQuestionText(){
        return questionText;
    }
    
    public boolean getCaseSensitivity(){
        return caseSensitive;
    }
    
    public String[] getAcceptableAnswers(){
        return acceptableAnswers;
    }
    
    public String getRawInput(){
        return rawInput;
    }
    
    public int getTimesQuestionAnswered(){
        return questionAnswered;
    }
    
    public int getCorrectAnswer(){
        return correctAnswer;
    }
    
    public boolean getCorrectAnswerBool(){
        //returns correctness as boolean
        if(correctAnswer > 0){
            return true;
        } else {
            return false;
        }
    }
    
    public void printCorrectness(){
        //immediately prints whether answer is correct
        if(correctAnswer == 1){
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }
    
    public void fillArgs(String qT, String[] aA, boolean cS){
       questionText = qT;
       acceptableAnswers = aA;
       caseSensitive = cS;
    }
       
    public void fillArgs(String qT, String[] aA){
       questionText = qT;
       acceptableAnswers = aA;
    }
}
