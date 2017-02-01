import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class TrafficLights extends Applet
{
	
	public void paint(Graphics g)
	{
		g.drawRect(40, 20, 100, 220);
		g.fillOval(60,30,60,60);
		g.fillOval(60,100,60,60);
		g.fillOval(60,170,60,60);
		g.fillRect(90, 240, 10, 100);
		
		//while(true)
		//{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.setColor(Color.red);
		g.fillOval(60,30,60,60);
		g.setColor(Color.black);
		g.fillOval(60,100,60,60);
		g.fillOval(60,170,60,60);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.setColor(Color.yellow);
		g.fillOval(60,100,60,60);
		g.setColor(Color.black);
		g.fillOval(60,30,60,60);
		g.fillOval(60,170,60,60);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.setColor(Color.green);
		g.fillOval(60,170,60,60);
		g.setColor(Color.black);
		g.fillOval(60,100,60,60);
		g.fillOval(60,30,60,60);
		}
	}

//}

