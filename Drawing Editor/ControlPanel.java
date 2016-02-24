import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.applet.*;
public class ControlPanel extends JPanel
{
    private JButton color;
    private JButton circle;
    private JButton square;
    private JPanel bottomPanel;
    private BorderLayout border;
    public ControlPanel(/*DrawingPanel canvas*/)
    {
        this.color = new JButton("Pick Color");
        this.circle = new JButton("Add Circle");
        this.square = new JButton("Add Square");
        
        this.bottomPanel = new JPanel();
        bottomPanel.add(this.color);
        bottomPanel.add(this.circle);
        bottomPanel.add(this.square);
        
        this.border = new BorderLayout();
        this.setLayout(border);
        this.add(bottomPanel, border.SOUTH);
        
    }
}
