import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
public class Circle extends Shape
{
    private Ellipse2D.Double circle;
    public Circle(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
        circle = new Ellipse2D.Double(center.getX(), center.getY(), 2 * radius, 2 * radius);
    }
    public void draw(Graphics2D g2, boolean filled)
    {
        double x = this.getCenter().getX();
        double y = this.getCenter().getY();
        circle = new Ellipse2D.Double(x, y, this.getRadius() * 2, this.getRadius() * 2);
        g2.setColor(this.getColor());
        g2.draw(circle);
        if (filled == true)
        {
            g2.fill(circle);
        }
    }
    public boolean isInside(Point2D.Double point)
    {
        double x = this.getCenter().getX();
        double y = this.getCenter().getY();
        circle = new Ellipse2D.Double(x, y, super.getRadius() * 2, super.getRadius() * 2);
        return circle.contains(point);
    }
}
