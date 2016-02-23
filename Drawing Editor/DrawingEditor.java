import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
public class DrawingEditor extends JFrame
{
    private JFrame frame;
    private final int width = 500;
    private final int height = 500;
    public DrawingEditor()
    {
        this.frame = new JFrame();
        
        this.frame.setTitle("Drawing Editor");
        this.frame.setSize(width, height);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
        
        //DrawingPanel canvas = new DrawingPanel();
        ControlPanel controls = new ControlPanel(/*canvas*/);
        this.frame.add(controls);
    }
    public static void main(String[] args)
    {
        DrawingEditor draw = new DrawingEditor();
    }
}
