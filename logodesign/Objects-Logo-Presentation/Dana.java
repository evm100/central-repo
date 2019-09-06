import apcslib.*;
import java.awt.Color;
import chn.util.*;
/**
 * Write a description of class Dana here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dana
{
    public static void main()
    {
       DrawingTool marker;
       SketchPad pad;
       pad = new SketchPad(600,600);
       marker = new DrawingTool(pad);
       marker.setColor(Color.BLUE);
       marker.up();
       marker.move(40,20);
       marker.down();
       marker.move(250,125);
       marker.move(0,125);
       marker.move(200,20);
       marker.move(120,200);
       marker.move(40,20);
       marker.up();
       marker.down();
       marker.setColor(Color.RED);
       marker.up();
       marker.move(85,100);
       marker.drawString("Mr. M's Test");
    }
}
