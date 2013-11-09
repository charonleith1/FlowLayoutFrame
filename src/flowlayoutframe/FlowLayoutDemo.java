// 2013 Fall St Pete College Corporate Training
// HITT Program : Java 
// @author charon leith
//
// see PowerPoint JavaGUIProgrammingLayoutManagers, slide 5 of 26
// FlowLayoutDemo  for Demo

package flowlayoutframe;

import javax.swing.JFrame;

public class FlowLayoutDemo {
    public static void main(String args[]) {
        FlowLayoutFrame flowLayoutFrame = new FlowLayoutFrame();
        flowLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flowLayoutFrame.setSize(400, 100);
        flowLayoutFrame.setVisible(true);
    }
}
