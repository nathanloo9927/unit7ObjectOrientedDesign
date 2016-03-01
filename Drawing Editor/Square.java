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
        Rectangle rect = new Rectangle(100,100,100,100);
    }
}
