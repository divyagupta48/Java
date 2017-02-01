import java.awt.*;
import java.awt.event.*;
public class CustomerFrame extends Frame implements ActionListener,ItemListener,WindowListener
{
	TextField tfu,tfa;
	Label lbl;
	Checkbox cbw;
	Checkbox cbr;
	CheckboxGroup cbg;
	Button btn;
	Checkbox sd;
	double amount,temp;
	Panel p1,p2,p3;
	void displayCustomerFrame()
	{
		p1=new Panel(new GridLayout(3,1));
		p2=new Panel(new GridLayout(3,1));
		p3=new Panel(new GridLayout(1,3));
		setSize(350,300);
		FlowLayout fl=new FlowLayout();
		setLayout(fl);
		setTitle("Brilliant Packaging Company");
		tfu=new TextField(5);
		lbl=new Label("Enter units ",Label.LEFT);
		p1.add(lbl);
		p1.add(tfu);
		lbl=new Label("Select Customer Type");
		p2.add(lbl);
		sd=new Checkbox("Special Discount");
		p1.add(sd);
		cbg=new CheckboxGroup();
		cbw=new Checkbox("Wholesaler",cbg,true);
		cbr=new Checkbox("Retailer",cbg,false);
		p2.add(cbw);
		p2.add(cbr);
		btn=new Button("Calculate amount");
		p3.add(btn);
		lbl=new Label("Total amount in rs.");
		p3.add(lbl);
		tfa=new TextField(5);
		p3.add(tfa);
		add(p1);
		add(p2);
		add(p3);
		tfa.setEditable(false);
		addWindowListener(this);
		btn.addActionListener(this);
		sd.addItemListener(this);
		cbw.addItemListener(this);
		cbr.addItemListener(this);
		setVisible(true);
	}
	public static void main(String[] args)
	{
	new CustomerFrame().displayCustomerFrame();

	}
	
	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e)
	{
		int units;
		units=Integer.parseInt(tfu.getText());
		if(e.getSource()==sd)
		{
		if(sd.getState())
			amount=amount-(amount*0.1);
		else
			amount=temp;
		}
		else if(e.getSource()==cbw)
		{
			if(units>=1&&units<=15)
				amount = units*50.0;
			else if(units>=16&&units<=20)
				amount=units*45.0;
			else if(units>=21&&units<=30)
				amount=units*40.0;
			else if(units>=31&&units<=50)
				amount=units*35.0;
			else
				amount=units*30.0;
			temp=amount;
		}
		else
		{
				if(units>=1&&units<=15)
					amount=units*60.0;
				else if(units>=16&&units<=20)
					amount=units*55.0;
				else if(units>=21&&units<=30)
					amount=units*50.0;
				else if(units>=31&&units<=50)
					amount=units*45.0;
				else
					amount=units*40.0;
				temp=amount;
		}
		tfa.setText(amount+"");
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int units;
		units=Integer.parseInt(tfu.getText());
		if(cbw.getState())
		{
		if(units>=1&&units<=15)
			amount = units*50.0;
		else if(units>=16&&units<=20)
			amount=units*45.0;
		else if(units>=21&&units<=30)
			amount=units*40.0;
		else if(units>=31&&units<=50)
			amount=units*35.0;
		else
			amount=units*30.0;
		}
		else if(cbr.getState())
		{
			if(units>=1&&units<=15)
				amount=units*60.0;
			else if(units>=16&&units<=20)
				amount=units*55.0;
			else if(units>=21&&units<=30)
				amount=units*50.0;
			else if(units>=31&&units<=50)
				amount=units*45.0;
			else
				amount=units*40.0;
		}
		tfa.setText(amount+"");
		temp=amount;
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
