import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
public class Square extends Shape
{
    public Square(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
    }
    public void draw(Graphics2D g2, boolean filled)
    {
        double x = super.getCenter().getX();
        double y = super.getCenter().getY();
        Rectangle2D.Double square = new Rectangle2D.Double(x, y, super.getRadius() * 2, super.getRadius() * 2);
        g2.draw(square);
        if (filled == true)
        {
            g2.fill(square);
        }
    }
}
