import javax.swing.JApplet;
import java.awt.Graphics;
public class q8 extends JApplet{
	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawString("*******************************",10,20);
		g.drawString("** Practice makes perfect",10,30);
		g.drawString("*******************************",10,40);
	}
}
