import apcslib.*;
import java.awt.Color;
import chn.util.*;
/**
 * Write a description of class Ethan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ethan
{
    public static void main()
    {
        ConsoleIO keyboard = new ConsoleIO();
        DrawingTool pencil;
        SketchPad paper;
        paper = new SketchPad(500, 500); 
        pencil = new DrawingTool(paper);
        getColor(pencil, keyboard);
        draw(pencil, keyboard);
    }

    public static void draw(DrawingTool pencil, ConsoleIO keyboard)
    {
       int x;
       /*int sides;
       int angle;
       double initial_forward = 0;
       double tangent = 0;
       double apothem = 0;
       System.out.print("Please enter the number of sides you wish your shape to have");
       sides = keyboard.readInt();
       angle = 180 - ((sides - 2) * 180)/sides;
       //tangent = Math.tan(180/sides);
       apothem = (sides)/(2*(Math.tan(3.14/sides)));
       initial_forward =(int)apothem * sides;
       pencil.up();
       pencil.home();
       pencil.down();
       pencil.drawCircle(50);
       pencil.up();
       pencil.forward(initial_forward);
       pencil.down();
       pencil.turnRight(90);
       pencil.forward(50);
       for(x = 0; x<sides; x++){
           pencil.turnRight(angle);
           pencil.forward(100);
       }
       pencil.turnRight(angle);
       pencil.forward(100); */

       pencil.up();
       pencil.home();
       pencil.down();
       pencil.drawString("Test 1");
       /*
       for(x = 0; x < 100; x++)
       {
           pencil.turnLeft(1);
           pencil.forward(50);
           pencil.drawString("Test 1");
           pencil.turnRight(100);
           pencil.forward(50);
        }
        */
       pencil.up();
       pencil.turnLeft(90);
       pencil.forward(125);
       pencil.down();
       for(x=0; x<100; x++)
       {
           pencil.drawCircle(15);
           pencil.up();
           pencil.forward(5);
           pencil.down();
           pencil.turnRight(3.6);
       }

    }

    public static void getColor(DrawingTool pencil, ConsoleIO keyboard)
    {
        Color color;
        pencil.setColor(Color.RED);
        /*Color color;
        Color = keyboard.readLine();
        pencil.setColor(Color.color);*/
    }
}
