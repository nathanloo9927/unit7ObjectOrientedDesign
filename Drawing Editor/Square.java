import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
public class Square extends Shape
{
    private Rectangle2D.Double square;
    public Square(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
        square = new Rectangle2D.Double(center.getX(), center.getY(), radius * 2, radius * 2);
    }
    public void draw(Graphics2D g2, boolean filled)
    {
        double x = this.getCenter().getX();
        double y = this.getCenter().getY();
        square = new Rectangle2D.Double(x, y, this.getRadius() * 2, this.getRadius() * 2);
        g2.setColor(this.getColor());
        g2.draw(square);
        if (filled == true)
        {
            g2.fill(square);
        }
    }
    public boolean isInside(Point2D.Double point)
    {
        double x = this.getCenter().getX();
        double y = this.getCenter().getY();
        square = new Rectangle2D.Double(x, y, this.getRadius() * 2, this.getRadius() * 2);
        return square.contains(point);
    }
}
