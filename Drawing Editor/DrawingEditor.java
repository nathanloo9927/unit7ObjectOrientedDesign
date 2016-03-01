import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
public class DrawingEditor extends JFrame
{
    private final int width = 500;
    private final int height = 500;
    public DrawingEditor()
    {
        this.setTitle("Drawing Editor");
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DrawingPanel canvas = new DrawingPanel();
        ControlPanel controls = new ControlPanel(canvas);
        this.add(controls);
        
        this.setVisible(true);
    }
    public static void main(String[] args)
    {
        DrawingEditor draw = new DrawingEditor();
    }
}
