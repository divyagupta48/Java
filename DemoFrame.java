import java.awt.*;
import java.awt.event.*;
public class DemoFrame extends Frame {

	void displayGUI()
	{
		setSize(300,300);
		setTitle("Awt Demo ");
		Label l1=new Label("ENTER YOUR NAME",Label.CENTER);
		TextField t=new TextField(30);
		FlowLayout fl=new FlowLayout();
		Button btn=new Button("ok");
		add(l1);
		add(t);
		add(btn);
		setLayout(fl);
	    setVisible(true);
	    //how to close the window
	    addWindowListener(new WindowAdapter()
	    {
	    	public void windowClosing(WindowEvent  windowEvent)
	    	{
	    		System.exit(0);
	    	}
	    });
	}
	public static void main(String[] args) {
	new DemoFrame().displayGUI();
		

	}

}
