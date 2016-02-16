import java.awt.*;
import javax.swing.*;
public class TriangleComponent extends JComponent
{
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;
    private final int x3;
    private final int y3;
    
    private Rectangle point;
    public TriangleComponent(int p1x, int p1y, int p2x, int p2y, int p3x, int p3y)
    {
        x1 = p1x;
        y1 = p1y;
        x2 = p2x;
        y2 = p2y;
        x3 = p3x;
        y3 = p3y;
        
        point = new Rectangle(p1x, p1y, 1, 1);
    }
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(point);
        //g2.drawLine(x1, y1, x2, y2);
    }
    
}
