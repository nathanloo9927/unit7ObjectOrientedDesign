import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TriangleFrame extends JFrame
{
    private static final int width = 300;
    private static final int height = 400;
    private TriangleComponent t;
    class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            t.addPoint(event.getX(), event.getY());
            repaint();
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
    public TriangleFrame()
    {
        t = new TriangleComponent();
        add(t);
        
        MouseListener listener = new MousePressListener();
        //t.addMouseListener(listener);
        
        setSize(width,height);
    }
    
}
