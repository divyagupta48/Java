import java.awt.*;
import java.awt.event.*;
public class CounterDemo extends Frame implements ActionListener
{
private int count=0;
TextField t;
	void displayGUI()
	{
		setSize(700,250);
		setTitle("AWT Counter ");
		Label l1=new Label("SEE NUMBER HERE..! ",Label.CENTER);
		 t=new TextField("0",30);
		FlowLayout fl=new FlowLayout();
		Button btn=new Button("Count");
		add(l1);
		t.setEditable(false);
		add(t);
		add(btn);
		btn.addActionListener(this);
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
	new CounterDemo().displayGUI();
		

	}
	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		++count;
		t.setText(count+"");
		
	}

}


