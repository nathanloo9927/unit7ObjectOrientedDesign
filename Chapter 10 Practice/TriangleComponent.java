import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
public class TriangleComponent extends JComponent
{
    private int count;
    private Point2D[] point;
    private static final int max = 3;
    public TriangleComponent()
    {
        count = 0;
        point = new Point2D[max];
    }
    public void addPoint(int x, int y)
    {
        if (count < max)
        {
            point[count] = new Point2D.Double(x,y);
            count++;
        } else
        {
            count = 0;
        }
        this.repaint();
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        if (count > 0)
        {
            //g2.draw(new Ellipse2D.Double(this.point[0].getX(), this.point[0].getY()));
        }
        if (count > 1)
        {
            g2.draw(new Line2D.Double(this.point[0], this.point[1]));
        }
        if (count > 2)
        {
            g2.draw(new Line2D.Double(this.point[1], this.point[2]));
            g2.draw(new Line2D.Double(this.point[2], this.point[0]));
        }
    }
    
}
