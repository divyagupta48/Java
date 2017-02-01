import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class CountryFrame extends Frame implements WindowListener,ActionListener
{
	Panel p,p2,p3;
	Choice l1,l2;
	String arr[]={"NEW DELHI","WASHINGTON,D.C.","CANBERRA","WELLINGTON","OTTAWA"};
	Button btn;
	Label lbl1;
	void displayFrame()
	{
		setSize(350,300);
		setLayout(new GridLayout(4,1));
		 p=new Panel(new FlowLayout());
		 p2=new Panel(new FlowLayout());
		 p3=new Panel(new FlowLayout());
		 setTitle("DISPLAY CAPITAL");
		 l1=new Choice();
		 l1.add("INDIA");
		 l1.add("USA");
		 l1.add("AUSTRALIA");
		 l1.add("NEW ZEALAND");
		 l1.add("CANADA");
		 l2=new Choice();
		 l2.add(arr[4]);
		 l2.add(arr[3]);
		 l2.add(arr[2]);
		 l2.add(arr[1]);
		 l2.add(arr[0]);
		 p.add(l1);
		 p.add(l2);
		 Label lbl=new Label("Select Country");
		 p3.add(lbl);
		 Label lbl2=new Label("Select Capital");
		 p3.add(lbl2);
		 btn=new Button("COMPARE");
		 p2.add(btn);
		 add(p3);
		 add(p);
		 add(p2);
		 lbl1=new Label("                                                 ",Label.CENTER);
		 addWindowListener(this);
		 btn.addActionListener(this);
		 add(lbl1);
		setVisible(true);
	}
public static void main(String[] args)throws Exception
	{
new CountryFrame().displayFrame();	
}
@Override
public void actionPerformed(ActionEvent e)
{
int i;
String s;
s=l2.getSelectedItem();
i=l1.getSelectedIndex();
if((s.equals(arr[0])&&i==0)||(s.equals(arr[1])&&i==1)||(s.equals(arr[2])&&i==2)||(s.equals(arr[3])&&i==3)||(s.equals(arr[4])&&i==4))
{
	lbl1.setText("Congratulations..! CORRECT ANSWER");
}
else 
{
	lbl1.setText("Wrong answer..! Correct answer is"+arr[i]);
}
}
@Override
public void windowActivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowClosed(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowClosing(WindowEvent arg0) {
	// TODO Auto-generated method stub
	System.exit(0);
}
@Override
public void windowDeactivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowDeiconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowIconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowOpened(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
