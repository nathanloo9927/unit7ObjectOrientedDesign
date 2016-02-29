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
    private DrawingPanel canvas;
    public ControlPanel(/*DrawingPanel canvas*/)
    {
        this.color = new JButton("Pick Color");
        this.circle = new JButton("Add Circle");
        this.square = new JButton("Add Square");
        
        ClickListener listener = new ClickListener(1);
        this.color.addActionListener(listener);
        ClickListener listener2 = new ClickListener(2);
        this.circle.addActionListener(listener2);
        ClickListener listener3 = new ClickListener(3);
        this.square.addActionListener(listener3);
        
        this.bottomPanel = new JPanel();
        bottomPanel.add(this.color);
        bottomPanel.add(this.circle);
        bottomPanel.add(this.square);
        
        this.border = new BorderLayout();
        this.setLayout(border);
        this.add(bottomPanel, border.SOUTH);
        
    }
    public class ClickListener implements ActionListener
    {
        private int number;
        public ClickListener(int buttonNumber)
        {
            this.number = buttonNumber;
        }
        public void actionPerformed(ActionEvent event)
        {
            if (number == 1)
            {
                canvas.pickColor();
            } else if (number == 2)
            {
                canvas.addCircle();
            } else if (number == 3)
            {
                canvas.addSquare();
            }
        }
    }
}
