// 2013 Fall St Pete College Corporate Training
// HITT Program : Java 
// @author charon leith
//
// see PowerPoint JavaGUIProgrammingLayoutManagers, slide 5 of 26
// FlowLayoutFrame for  Demo

package flowlayoutframe;

import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutFrame extends JFrame {
    private JButton leftJButton;
    private JButton centerJButton;
    private JButton rightJButton;
    private FlowLayout layout;
    private Container container;
    
    //set up GUI
    public FlowLayoutFrame() {
        super("FlowLayout Demo - Charon Leith");
        
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);
        
        //set up left  and listener
        leftJButton = new JButton("Left");
        add(leftJButton);
        leftJButton.addActionListener(
                new ActionListener() {       //anon inner class
                    //process button event
                    public void actionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.LEFT);
                        //realign attached parts
                        layout.layoutContainer(container);
                    }
                }
           );    //end call to listener
        
        //set up center and listener
        centerJButton = new JButton("Center");
        add(centerJButton);
        centerJButton.addActionListener(
                new ActionListener() {       //anon inner class
                    //process button event
                    public void actionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.CENTER);
                        //realign attached parts
                        layout.layoutContainer(container);
                    }
                }
           );    //end call to listener        
        
        //set up right and listener
        rightJButton = new JButton("Right");
        add(rightJButton);
        rightJButton.addActionListener(
                new ActionListener() {       //anon inner class
                    //process button event
                    public void actionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.RIGHT);
                        //realign attached parts
                        layout.layoutContainer(container);
                    }
                }
           );    //end call to listener   
        
    }
}
