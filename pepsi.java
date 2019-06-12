 


import java.awt.geom.Arc2D;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.Shape;
import java.awt.geom.CubicCurve2D;
import java.awt.Dimension;
import java.awt.Font;

public class pepsi extends JComponent{

    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.white);
        Rectangle bkg = new Rectangle(0, 0, 10000, 10000);
        g2.fill(bkg);
        g2.setColor(Color.red);
        Shape red = new Arc2D.Float(300, 90, 360, 360, 0, 180, Arc2D.CHORD);
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                  RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.draw(red);
        g2.fill(red);
        
        g2.setColor(Color.blue);
        Shape blue = new Arc2D.Float(300, 90, 360, 360, 180, 180, Arc2D.CHORD);
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                  RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.draw(blue);
        g2.fill(blue);

        g2.setColor(Color.white);
        // create new CubicCurve2D.Double
        CubicCurve2D c = new CubicCurve2D.Double();
        // draw CubicCurve2D.Double with set coordinates
        c.setCurve(300, 275, 425, 300, 525, 250, 650, 275);
        g2.setStroke(new BasicStroke(93));
        g2.draw(c);
        
        Dimension d = this.getPreferredSize();
        int fontSize = 60;
        
        g2.setFont(new Font("Dialog", Font.PLAIN, fontSize));
        g2.setColor(Color.blue);
        g2.drawString("P E P S I", 368, 294);
       
        g2.setStroke(new BasicStroke(1));
        
   	// comment this out once you have finished
        //drawGrid(g2);
    }
    public void drawGrid(Graphics g2){
        g2.setColor(new Color(211, 211, 211));
        
        // Draw vertical lines
        for(int x = 0; x < 1000; x += 50){
            g2.drawLine(x, 0, x, 1000);
            g2.drawString("" + x, x, 10);
        }
        
        // Draw horizontal lines
        for(int y = 50; y < 1000; y += 50){
            g2.drawLine(0, y, 1000, y);
            g2.drawString("" + y, 0, y);
        }
    }
}
