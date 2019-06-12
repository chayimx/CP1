import java.awt.Rectangle;
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Rect{
	public static void main(String[] args){
		Rectangle box = new Rectangle(10, 20, 50, 80);
		System.out.println(box.getWidth());
		System.out.println(box.getHeight());
		System.out.println(box.getX());
		System.out.println(box.getY());
		
	}

}