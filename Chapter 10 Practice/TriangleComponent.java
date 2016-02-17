import java.awt.*;
import javax.swing.*;
public class TriangleComponent extends JComponent
{
    private int count;
    private Rectangle[] point;
    public TriangleComponent()
    {
        count = 0;
        point = new Rectangle[3];
    }
    public void addPoint(int x, int y)
    {
        if (count < 3)
        {
            point[count] = new Rectangle(x,y,0,0);
            count++;
        } else
        {
            count = 0;
        }
    }
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        if (count == 0)
        {
            g2.draw(point[0]);
        } else if (count == 1)
        {
            g2.draw(point[1]);
            g2.drawLine((int)point[0].getX(),(int)point[0].getY(), (int)point[1].getX(), (int)point[1].getY());
        }
    }
    
}
