import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class ButtonViewer
{
    private final int FRAME_WIDTH = 100;
    private final int FRAME_HEIGHT = 100;
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JButton b;
    private JLabel label;
    public ButtonViewer()
    {
        this.frame = new JFrame();
        this.panel = new JPanel();
        
        this.button = new JButton("For Justice!");
        this.panel.add(this.button);
        
        this.b = new JButton("By the light!");
        this.panel.add(this.b);
        
        this.label = new JLabel();
        this.panel.add(this.label);
        
        this.frame.add(panel);
        
        ClickListener listener = new ClickListener();
        this.button.addActionListener(listener);
        
        ClickListener l = new ClickListener();
        this.b.addActionListener(l);
        
        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        ButtonViewer view = new ButtonViewer();
    }
    
    public class ClickListener implements ActionListener
    {
        private int count = 0;
        public void actionPerformed(ActionEvent event)
        {
            count++;
            label.setText(event.getActionCommand() + " was clicked " + count + " times");
        }
    }
}