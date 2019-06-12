
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;

public class MMouse extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;

		g2.setColor(Color.black);

		Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 200); //head
		g2.fill(circle);
        Ellipse2D.Double circle0 = new Ellipse2D.Double(50, 50, 100, 100); //left ear
        g2.fill(circle0);
        Ellipse2D.Double circle1 = new Ellipse2D.Double(250, 50, 100, 100); //right ear
        g2.fill(circle1);

	}
}
