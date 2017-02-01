import java.awt.*;
import java.awt.event.*;
public class LoginForm extends Frame implements  ActionListener,WindowListener
{
	Label lUid,lPass,lMessage;
	TextField tUid,tPass;
	Button btn;
	String sUid="Divya Gupta",sPass="Hello_123";
	Panel p1;
void displayFrame()
{
	setSize(700,300);
	FlowLayout fl=new FlowLayout();
	setLayout(fl);
	p1=new Panel(new GridLayout(3,2));
	setTitle("LOGIN FORM");
	lUid=new Label("ENTER USER ID",Label.LEFT);
	lPass=new Label("ENTER PASSWORD",Label.LEFT);
	tUid=new TextField(20);
	tPass=new TextField(20);
	btn=new Button("SUBMIT");
	//lMessage=new Label("",Label.CENTER);
	p1.add(lUid);
	p1.add(tUid);
	p1.add(lPass);
	p1.add(tPass);
	tPass.setEchoChar('*');
	p1.add(btn);
	add(p1);
	btn.addActionListener(this);
	//add(lMessage);
	addWindowListener(this);
	setVisible(true);
	}
	public static void main(String[] args) {
		new LoginForm().displayFrame();

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
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String s1,s2;
		s1=tUid.getText();
		s2=tPass.getText();
		LoginFormPart obj=new LoginFormPart();
		if(s1.equals(sUid)&&s2.equals(sPass))
		{
			obj.validFrame();
		}
		//lMessage.setText("WELCOME USER "+s1" ....!");
		else
		{
			obj.invalidFrame();
		}
			//lMessage.setText("INVALID USER...! Please Try Again");
		
		}

}
