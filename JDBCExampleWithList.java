import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class JDBCExampleWithList extends Frame implements ActionListener
{
	List ldept;
	ResultSet rs=null;
	Statement stmt=null;
	Connection con=null;
	TextArea ta;
	JDBCExampleWithList()
	{
		
		setLayout(new GridLayout(3,1));
		setSize(250,150);
		setTitle("Employee Information");
		ldept=new List(5);
		
		add(new Label("Select Department Number",Label.CENTER));
		add(ldept,CENTER_ALIGNMENT);
		ldept.addActionListener(this);
		ta = new TextArea();
		add(ta);
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");  
			stmt= con.createStatement();
			rs= stmt.executeQuery("select dno from dept");
			
			while(rs.next())
			{
				ldept.add(rs.getInt("dno")+"");
			} 
			stmt.close();
			rs.close();
			con.close();
		} catch (Exception e) {}
		setVisible(true);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JDBCExampleWithList();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
	     ta.setText("");
		int choice = Integer.parseInt(ldept.getSelectedItem());
		
		try
		{
		   Class.forName("com.mysql.jdbc.Driver");  
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");  
		   stmt= con.createStatement();
		   rs= stmt.executeQuery("select * from pers where dno =" + choice );
        while(rs.next())
        {
        	ta.append(rs.getInt("empcode") +"\t\t" + rs.getString("empname") + "\t\t" +  rs.getInt("dno") + "\n");
        	
        }
		}
		catch(Exception x){}
	}
}
