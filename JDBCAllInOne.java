package swings_programs;
import javax.swing.*;

import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.DriverManager;
public class JDBCAllInOne extends JFrame implements ActionListener
{
JTextField t1,t2,t3,t4;	
JButton add,update,delete,leftShift,rightShift;
JLabel val1,val2,val3,val4;
Connection con=null;
Statement stmt=null;
ResultSet rs=null;
JDBCAllInOne()
{
	try{
	Class.forName("com.mysql.jdbc.Driver");
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
	setTitle("JDBC All In One");
	JPanel p1=new JPanel(new GridLayout(4,2));
	JPanel p2=new JPanel(new GridLayout(1,3));
	JPanel p3=new JPanel(new GridLayout(4,2));
	JPanel p4=new JPanel(new GridLayout(1,2));
	p1.add(new JLabel("Employee Code:"));
	p1.add(t1=new JTextField(30));
	p1.add(new JLabel("Employee Name:"));
	p1.add(t2=new JTextField(30));
	p1.add(new JLabel("Designation:"));
    p1.add(t3=new JTextField(30));
	p1.add(new JLabel("Dept No.:"));
	p1.add(t4=new JTextField(30));
	p2.add(add=new JButton("Add"));
	p2.add(update=new JButton("Update"));
	p2.add(delete=new JButton("Delete"));
	p3.add(new JLabel("Employee Code:"));
	p3.add(val1=new JLabel("Val"));
	p3.add(new JLabel("Employee Name:"));
	p3.add(val2=new JLabel("Val"));
	p3.add(new JLabel("Designation:"));
	p3.add(val3=new JLabel("Val"));
	p3.add(new JLabel("Dept No.:"));
	p3.add(val4=new JLabel("Val"));
	p4.add(leftShift=new JButton("<<"));
	p4.add(rightShift=new JButton(">>"));
	p1.setBounds(0,0,650,80);
	add(p1);
	p2.setBounds(0,80,650,70);
	add(p2);
	p3.setBounds(0,150,650,80);
	add(p3);
	p4.setBounds(0,230,650,70);
	add(p4);
	setLayout(null);
	setVisible(true);
	setSize(650,330);
	setResizable(false);
	add.addActionListener(this);
	update.addActionListener(this);
	delete.addActionListener(this);
	leftShift.addActionListener(this);
	rightShift.addActionListener(this);}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
void add()
{
	
}
void update()
{
	
}
void delete()
{
	
}
public static void main(String[] args) {
new JDBCAllInOne();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		try
		{
		if(e.getSource()==add)
		{
			add();
		}
		else if(e.getSource()==update)
		update();
		else if(e.getSource()==delete)
			delete();
		else if(e.getSource()==leftShift)
		{
			if(rs==null)
	        {
	        	stmt= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				rs=stmt.executeQuery("select * from department");
	        }	
	        
				if(rs.previous())
				{
					int num=rs.getInt(1);
					String name=rs.getString(2);
					String loc=rs.getString(3);
					t1.setText(num+"");
					t2.setText(name);
					t3.setText(loc);
				}
			
		}
		else if(e.getSource()==rightShift)
		{
		     if(rs==null)
		        {
		        	stmt= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
					rs=stmt.executeQuery("select * from department");
		        }	
		        
		        if(rs.next())
		        {
				   int num=rs.getInt(1);
				   String name=rs.getString(2);
				   String loc=rs.getString(3);
				   t1.setText(num+"");
				   t2.setText(name);
				   t3.setText(loc);
		        }
			
		}
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}

}
