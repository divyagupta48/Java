import java.awt.*;
import java.awt.event.*;
public class LoginFormPart extends Frame implements  WindowListener
{
	void validFrame()
	{
		setSize(300,300);
		FlowLayout fl=new FlowLayout();
		setLayout(fl);
		setTitle("VALID USER");
		Label lbl=new Label("WELCOME USER DIVYA...!",Label.CENTER);
		add(lbl);
		setVisible(true);
		addWindowListener(this);
	}
	void invalidFrame()
	{
		setSize(300,300);
		FlowLayout fl=new FlowLayout();
		setLayout(fl);
		setTitle("INVALID USER");
		Label lbl=new Label("INVALID USER...! Please Try Again",Label.CENTER);
		add(lbl);
		setVisible(true);
		addWindowListener(this);
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
