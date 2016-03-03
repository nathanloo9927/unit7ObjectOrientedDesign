import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
public abstract class Shape
{
    private Point2D.Double ctr;
    private double r;
    private Color c;
    public Shape(Point2D.Double center, double radius, Color color)
    {
        this.ctr = center;
        this.r = radius;
        this.c = color;
    }
    public Point2D.Double getCenter()
    {
        return this.ctr;
    }
    public double getRadius()
    {
        return this.r;
    }
    public Color getColor()
    {
        return this.c;
    }
    public void move(double x, double y)
    {
        ctr = new Point2D.Double(x,y);
    }
    public void setRadius(double rad)
    {
        this.r = rad;
    }
    public abstract boolean isInside(Point2D.Double point);
    public abstract void draw(Graphics2D g2, boolean filled);
}
