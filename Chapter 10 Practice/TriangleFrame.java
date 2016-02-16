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
            int x = event.getX();
            int y = event.getY();
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
        t = new TriangleComponent(150, 50, 75, 200, 225, 200);
        add(t);
        
        MouseListener listener = new MousePressListener();
        t.addMouseListener(listener);
        
        setSize(width,height);
    }
    
}
