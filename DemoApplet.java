import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class DemoApplet extends Applet
{
public void paint(Graphics g)
{
	g.setColor(Color.red);
	//g.drawString("Hello",50,50);
	//g.drawLine(10, 10,50, 150);
	g.drawRect(50, 50,100,100);
	g.fillRect(50, 50,100, 100);
	//g.drawRoundRect(50, 50, 100, 100, 10, 10);
	//g.setColor(Color.black);
	//g.fillOval(25, 35, 35, 35);
}
}
