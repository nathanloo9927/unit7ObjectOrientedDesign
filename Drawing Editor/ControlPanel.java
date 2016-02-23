import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
public class ControlPanel extends JPanel
{
    private JPanel panel;
    private JButton color;
    private JButton circle;
    private JButton square;
    public ControlPanel(/*DrawingPanel canvas*/)
    {
        this.panel = new JPanel();
        
        this.color = new JButton("Pick Color");
        this.panel.add(this.color);
        this.circle = new JButton("Add Circle");
        this.square = new JButton("Add Square");
        this.panel.add(this.circle);
        this.panel.add(this.square);
        
        
    }
}
