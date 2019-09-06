import apcslib.*;
import java.awt.Color;
import chn.util.*;

/**
 * Write a description of class Jared here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Jared
{
    public static void main(){
       SketchPad pad = new SketchPad(500,500);
       DrawingTool pencil = new DrawingTool(pad);
       
       //drawShape(pencil);
       drawSquare(pencil);
       //circleDraw(pencil);
       //writeWords(pencil);
       //hexagonDraw(pencil);
       //useCoords(pencil);
    }
    
    public static void drawShape(DrawingTool pencil){
     pencil.up();
     pencil.home();
     pencil.down();
     pencil.move(50,0);
     pencil.move(50, 50);
     pencil.move(0, 50);
     pencil.move(0,0);
     pencil.up();
     pencil.down();
     pencil.move(-10, 25);
     pencil.move(-10, 75);
     pencil.move(40, 75);
     pencil.move(40, 25);
     pencil.move(50, 0);
    }
    
    public static void drawSquare(DrawingTool pencil){
    ConsoleIO keyboard = new ConsoleIO();
    String colorInput;
    Color myColor = new Color(172, 230, 172);
    System.out.print("Please enter a color: ");
    colorInput = keyboard.readLine();
    pencil.setColor(whatColor(colorInput));
    pencil.turnRight(90);
    pencil.forward(100);
    pencil.turnLeft(90);
    pencil.forward(100);
    pencil.turnLeft(90);
    pencil.forward(200);
    pencil.turnLeft(90);
    pencil.forward(100);
    pencil.turnLeft(90);
    pencil.forward(100);
    }
    
    public static void circleDraw(DrawingTool pencil){
        ConsoleIO keyboard = new ConsoleIO();
        String colorInput;
        pencil.home();
        pencil.up();
        pencil.forward(25);
        pencil.turnLeft(90);
        pencil.forward(25);
        pencil.down();
        System.out.print("Please enter a color: ");
        colorInput = keyboard.readLine();
        pencil.setColor(whatColor(colorInput));
        pencil.drawCircle(12);
        pencil.home();
        pencil.up();
        pencil.forward(25);
        pencil.turnRight(90);
        pencil.forward(25);
        pencil.down();
        System.out.print("Please enter a color: ");
        colorInput = keyboard.readLine();
        pencil.setColor(whatColor(colorInput));
        pencil.drawCircle(12);
        
    }
    
    public static void writeWords(DrawingTool pencil){
        ConsoleIO keyboard = new ConsoleIO();
        String colorInput;
        //Color red = "255, 0, 0";
        //Color RED = new Color(255,102,102);
        colorInput = keyboard.readLine();
        pencil.setColor(whatColor(colorInput));
        pencil.home();
        pencil.up();
        pencil.forward(50);
        pencil.turnLeft(90);
        pencil.forward(25);
        pencil.drawString("Test #1");
    }
    
    public static void hexagonDraw(DrawingTool pencil){
        pencil.up();
        pencil.home();
        pencil.down();
        pencil.drawCircle(60);
        pencil.up();
        pencil.turnRight(90);
        pencil.forward(87);
        pencil.turnRight(90);
        pencil.forward(50);
        pencil.turnLeft(180);
        pencil.down();
        pencil.forward(100);
        pencil.turnLeft(60);
        pencil.forward(100);
        pencil.turnLeft(60);
        pencil.forward(100);
        pencil.turnLeft(60);
        pencil.forward(100);
        pencil.turnLeft(60);
        pencil.forward(100);
        pencil.turnLeft(60);
        pencil.forward(100);
        pencil.turnLeft(60);
    }
    
    public static Color whatColor(String selColor){
        Color returnVal = Color.BLACK;
        
        switch(selColor){
         case "Red":
         case "red":
            returnVal = Color.RED;
            break;
         case "Blue" :
         case "blue" :
            returnVal = Color.BLUE;
            break;
         case "Yellow" :
         case "yellow" :
            returnVal = Color.YELLOW;
            break;
         case "Green" :
         case "green" :
            returnVal = Color.GREEN;
            break;
         case "Magenta" :
         case "magenta" :
            returnVal = Color.MAGENTA;
            break;
         case "Cyan" :
         case "cyan" :
            returnVal = Color.CYAN;
            break;
         case "Black" :
         case "black" :
            returnVal = Color.BLACK;
            break;
         case "White" :
         case "white" :
            returnVal = Color.WHITE;
            break;
         case "Orange" :
         case "orange" :
            returnVal = Color.ORANGE;
            break;
         case "Pink" :
         case "pink" :
            returnVal = Color.PINK;
            break;
         case "Purple":
         case "purple":
            Color purple = new Color(155, 50, 168);
            returnVal = purple;
            break;
        }
        return returnVal;
    }
    
    public static void useCoords(DrawingTool pencil){
     
     pencil.up();
     pencil.home();
     pencil.down();
     
     pencil.up();
     pencil.move(10, 60);
     pencil.down();
     pencil.move(30, 40);
     pencil.move(60, 40);
     pencil.move(80, 60);
     pencil.up();
     pencil.move(30, 80);
     pencil.drawCircle(20);
     pencil.move(60, 80);
     pencil.drawCircle(20);
     
     //pencil.turn();
     //pencil.forward(100);
    }
}
