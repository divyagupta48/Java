import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class HumanFace extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(19, 19, 151, 151);//black oval face
		g.setColor(Color.yellow);
		g.fillOval(20, 20, 150, 150);//yellow circle
		g.setColor(Color.black);
		g.drawOval(56,56, 26, 31);//eyes black drawn circle
	    g.drawOval(121,56, 26, 31);//eyes circle
	    g.drawArc(50, 50, 35, 45, 70, 80);//eyebrow
	    g.drawArc(49, 49, 35, 46, 70, 80);//eyebrow
	    g.drawArc(116, 44, 35, 45, 45, 90);//eyebrow
	    g.drawArc(115, 43, 35, 46, 45, 90);//eyebrow
	    g.drawArc(12, 85, 15, 30,75, 220);//ear left
	    g.drawArc(163,85 , 10, 30, 75, -180);//ear right
	    g.fillArc(35,10,120,40,0,180);//hair main
	    g.fillArc(35,10,70,40,180,40);//left part of hair
	    g.fillArc(85,10,70,40,0,-40);//rght part of hair
		g.setColor(Color.white);
		g.fillOval(57,57, 25, 30);//eye left
	    g.fillOval(122,57, 25, 30);//eye right
		g.setColor(Color.blue);
		g.fillOval(59,60,17,20);//eye ball left
		g.fillOval(124,60,17,20);//eye ball right
		g.setColor(Color.pink);
		g.fillOval(40, 100, 20, 25);//cheek left
		g.fillOval(152, 100, 10, 25);//cheek right
		g.setColor(Color.black);
		g.fillOval(63, 64, 10, 10);//eye ball left
		g.fillOval(128, 64, 10, 10);//eye ball right
		g.drawArc(95,110, 10, 5, 0,-180);//nose 
		g.drawArc(95,85, 10,55, 0,90);//nose
		g.setColor(Color.red);
		g.drawArc(70,130,60,10,0,-180);//smile
		g.fillArc(115,120,10,40,0, -180);//tongue
	}

}
