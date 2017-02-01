import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends Frame implements WindowListener,ActionListener
{
	String op,s2;
	Panel p;
	TextField t;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bAdd,bSub,bMul,bDiv,bEq,bMod,btnC,object;
	void displayFrame()
	{
		setResizable(false);
		setSize(250,300);
		setLayout(new FlowLayout());
		p=new Panel(new GridLayout(4,5,10,20));
		setTitle("CALCULATOR");
		t=new TextField("0",20);
		add(t);
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b0=new Button("0");
		bAdd=new Button("+");
		bSub=new Button("-");
		bMul=new Button("*");
		bDiv=new Button("/");
		bMod=new Button("%");
		bEq=new Button("=");
		btnC=new Button("C");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b0);
		p.add(bAdd);
		p.add(bSub);
		p.add(bMul);
		p.add(bDiv);
		p.add(bMod);
		p.add(bEq);
		p.add(btnC);
		add(p);
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bAdd.addActionListener(this);
		bSub.addActionListener(this);
		bMul.addActionListener(this);
		bDiv.addActionListener(this);
		bEq.addActionListener(this);
		bMod.addActionListener(this);
		btnC.addActionListener(this);
		addWindowListener(this);
		setVisible(true);
	}

	public static void main(String[] args)throws Exception
	{
      new Calculator().displayFrame();
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
		String s1=t.getText(),c;
		int res=0;
		object=new Button();
		object=(Button) e.getSource();
		if(object==b1||object==b2||object==b3||object==b4||object==b5||object==b6||object==b7||object==b8||object==b9||object==b0)
		{
			s1=s1+e.getActionCommand();
			t.setText(s1);
		}
	    c=e.getActionCommand();
	    if(c.equals("+")||c.equals("-")||c.equals("*")||c.equals("/")||c.equals("%"))
	    {
	    	t.setText("");
	    	op=c;
	    	s2=s1;
	    	s1="";
	    }
	    else if(c.equals("="))
	    {
	    if(op.equals("+"))
	    	{
	    	res=Integer.parseInt(s1)+Integer.parseInt(s2);	
	    	}
	    else if(op.equals("-"))
	    	{
	    	res=Integer.parseInt(s1)-Integer.parseInt(s2);	
	    	}
	    else if(op.equals("/"))
	    	{
	    	res=Integer.parseInt(s1)/Integer.parseInt(s2);	
	    	}
	    else if(op.equals("*"))
	    	{
	    	res=Integer.parseInt(s1)*Integer.parseInt(s2);	
	    	}
	    else if(op.equals("%"))
	    	{
	    	res=Integer.parseInt(s1)%Integer.parseInt(s2);	
	    	}
	    t.setText(""+res);
	    }
	    else if(c.equals("C"))
	    {
	    	t.setText("");
	    	s1="";
	    	s2="";
	    	res=0;

	    }
	}
	

}
