import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
public class DrawingPanel extends JComponent
{
    private ArrayList<Shape> shapes;
    private JColorChooser cc;
    private Color color;
    private Shape active;
    public DrawingPanel()
    {
        shapes = new ArrayList<Shape>();
        MouseListener listener = new MousePressListener();
        this.addMouseListener(listener);
        MouseMotionListener motion = new MouseMoveListener();
        this.addMouseMotionListener(motion);
        color = Color.RED;
        cc = new JColorChooser(color);
    }
    public Color getColor()
    {
        return color;
    }
    public Dimension getPreferredSize()
    {
        return new Dimension(1000,800);
    }
    public void pickColor()
    {
        Color newcolor = cc.showDialog(this, "Choose a color", color);
        if (newcolor != null)
        {
            color = newcolor;
        }
    }
    public void addCircle()
    {
        Point2D.Double shape = new Point2D.Double(200,200);
        Circle c = new Circle(shape, 50, color);
        this.shapes.add(c);
    }
    public void addSquare()
    {
        Point2D.Double shape = new Point2D.Double(200,200);
        Square s = new Square(shape, 50, color);
        this.shapes.add(s);
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Shape shape: shapes)
        {
            shape.draw(g2,active == null? true: (!(active == shape)));
        }
    }
    class MousePressListener implements MouseListener
    {
        private boolean there;
        public void mousePressed(MouseEvent event)
        {
            there = false;
            for (Shape shape: shapes)
            {
                Point2D.Double point = new Point2D.Double(event.getX(), event.getY());
                if (shape.isInside(point))
                {
                    there = true;
                    active = shape;
                }
            }
            if (there != true)
            {
                active = null;
            }
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
    class MouseMoveListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent event)
        {
            active.move(event.getX(), event.getY());
            repaint();
        }
        public void mouseMoved(MouseEvent event)
        {
            
        }
    }
}
