import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
public class Circle extends Shape
{
    public Circle(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
    }
    public void draw(Graphics2D g2, boolean filled)
    {
        double x = super.getCenter().getX();
        double y = super.getCenter().getY();
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, super.getRadius() * 2, super.getRadius() * 2);
        g2.draw(circle);
        if (filled == true)
        {
            g2.fill(circle);
        }
    }
}
