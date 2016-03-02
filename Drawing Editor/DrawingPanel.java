import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
public class DrawingPanel extends JFrame
{
    private ArrayList<Shape> shapes;
    private JColorChooser cc;
    private Color color;
    private int active;
    public DrawingPanel()
    {
        active = 0;
        MouseListener listener = new MousePressListener();
        MouseMotionListener motion = new MouseMoveListener();
        Color color = Color.RED;
        cc = new JColorChooser(color);
    }
    public Color getColor()
    {
        return color;
    }
    public Dimension getPreferredSize()
    {
        return new Dimension(400,400);
    }
    public void pickColor()
    {
        color = cc.showDialog(null, "Choose a color", color);
    }
    public void addCircle()
    {
        Point2D.Double shape = new Point2D.Double(200,200);
        Circle c = new Circle(shape, 50, color);
        this.shapes.add(c);
        active = shapes.size() - 1;
        repaint();
    }
    public void addSquare()
    {
        Point2D.Double shape = new Point2D.Double(200,200);
        Square s = new Square(shape, 50, color);
        this.shapes.add(s);
        active = shapes.size() - 1;
        repaint();
    }
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0 ; i < active; i++)
        {
        }
        repaint();
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
