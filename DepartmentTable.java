package swings_programs;
import javax.swing.*;

import java.sql.*;
import java.awt.event.*;
import java.awt.*;
public class DepartmentTable extends JFrame implements ActionListener
{
	JTextField t1,t2,t3;
	JButton first,previous,next,last;
	static Statement stmt;
	static ResultSet rs;
	static Connection con;
DepartmentTable()
{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
		setTitle("Department Table(DEPT)");
		 JLabel lbl1=new JLabel("Dept No.");
		 lbl1.setBounds(20,40,50,30);
		 add(lbl1);
		 t1=new JTextField(20);
		 t1.setBounds(100,40,70,30);
		 add(t1);
		 JLabel lbl2=new JLabel("Dept Name");
		 lbl2.setBounds(20,100,70,30);
	add(lbl2);
	t2=new JTextField(20);
	t2.setBounds(100,100,70,30);
	add(t2);
	JLabel lbl3=new JLabel("Location");
	lbl3.setBounds(20,150,70,30);
	add(lbl3);
	t3=new JTextField(20);
	t3.setBounds(100,160,70,30);
	add(t3);
	first=new JButton("First");
	first.setBounds(250,70,80,40);
	add(first);
	previous=new JButton("Previous");
	previous.setBounds(350,70,100,40);
	add(previous);
	last=new JButton("Last");
	last.setBounds(580,70,80,40);
	add(last);
	next=new JButton("Next");
	next.setBounds(470,70,80,40);
	add(next);
	last=new JButton("Last");
	last.setBounds(590,70,80,40);
	add(last);
	setVisible(true);
	setLayout(null);
	setSize(1000,300);
	first.addActionListener(this);
	next.addActionListener(this);
	previous.addActionListener(this);
	last.addActionListener(this);
	
	}
	catch(Exception e)
	{
		System.out.println("Exception generated "+e);
	}
}
public static void main(String[] args) 
{
	new DepartmentTable();
}
	@Override

	public void actionPerformed(ActionEvent e)
	{
		
		try
		{
		
			if(e.getSource()==first)
			{
			
				if(rs==null)
				{
					stmt= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
					rs=stmt.executeQuery("select * from department");
				}
				if(rs.first())
				{
					int num=rs.getInt(1);
					String name=rs.getString(2);
					String loc=rs.getString(3);
					t1.setText(num+"");
					t2.setText(name);
					t3.setText(loc);
				}
			}	
			else if(e.getSource()==last)
			{
			 if(rs==null)
		     {
		        	stmt= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
					rs=stmt.executeQuery("select * from department");
		     }
			
			if(rs.last())
			{
				int num=rs.getInt(1);
				String name=rs.getString(2);
				String loc=rs.getString(3);
				t1.setText(num+"");
				t2.setText(name);
				t3.setText(loc);
			}
		   }
		else if(e.getSource()==next)
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
		else if(e.getSource()==previous)
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
			
	} catch(Exception e1)
	  {
			System.out.println(e1);
	  }
  }
	
}


