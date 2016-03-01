import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
public class DrawingPanel extends JFrame
{
    private int count;
    private ArrayList<Shape> shapes;
    private JColorChooser cc;
    private Color color;
    public DrawingPanel()
    {
        count = 0;
        MouseListener listener = new MousePressListener();
        MouseMotionListener motion = new MouseMoveListener();
        Color color = Color.RED;
        cc = new JColorChooser(color);
    }
    public /*Color*/ void /*(using void to compile)*/ getColor()
    {
        
    }
    public /*Dimension*/ void /*(using void to compile)*/ getSomething/*getPreferredSize (using getSomething to compile)*/()
    {
        
    }
    public void pickColor()
    {
        color = cc.showDialog(null, "Choose a color", color);
    }
    public void addCircle()
    {
        
    }
    public void addSquare()
    {
        
    }
    public void paintComponent(Graphics g)
    {
        
    }
    class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            
        }
        public void mouseReleased(MouseEvent event)
        {
            
        }
        public void mouseClicked(MouseEvent event)
        {
            
        }
        public void mouseEntered(MouseEvent event)
        {
            
        }
        public void mouseExited(MouseEvent event)
        {
            
        }
    }
    class MouseMoveListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent event)
        {
            
        }
        public void mouseMoved(MouseEvent event)
        {
            
        }
    }
}
