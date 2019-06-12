import javax.swing.JFrame;
import java.awt.geom.Arc2D;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.Shape;
import java.awt.geom.CubicCurve2D;

public class pframe
{
    public static void main(String[] args){
	
	// You should change the Title
        JFrame frame = new JFrame("Frame for Picture");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pepsi pepsi = new pepsi();
        frame.add(pepsi);
        
        frame.setVisible(true);
    }
}
