public class BetterRectangle extends java.awt.Rectangle
{
    public BetterRectangle(int x, int y, int width, int height)
    {
        super();
        super.setLocation(x,y);
        super.setSize(width,height);
    }
    public double getArea()
    {
        return this.getWidth() * this.getHeight();
    }
    public double getPerimeter()
    {
        return this.getWidth()*2 + this.getHeight()*2;
    }
    public static void main(String[] args)
    {
        BetterRectangle r = new BetterRectangle(0,0,10,20);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
    }
}
