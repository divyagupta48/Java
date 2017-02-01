import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class JDBCExampleofDataEntry  implements ActionListener 
{
	Label lblEmpcode,lblEmpname,lblDesignation,lblDno;
	TextField txtEmpcode,txtEmpname,txtDesignation,txtDno;
	Button btnAdd;
	ResultSet rs;
	Connection con = null;
	void createUI()
	{
		Frame frame = new Frame("Employee Personal Entry Form");
        frame.setLayout(new GridLayout(2,1));
		Panel pnlInput = new Panel(new GridLayout(4,2));

		lblEmpcode = new Label("  Employee Code : ");
		txtEmpcode = new TextField(15);

		lblEmpname = new Label("  Employee Name : ");
		txtEmpname = new TextField();

		lblDesignation = new Label("  Designation : ");
		txtDesignation = new TextField();

		lblDno = new Label("  Dept No : ");
		txtDno = new TextField();

		pnlInput.add(lblEmpcode);
		pnlInput.add(txtEmpcode);

		pnlInput.add(lblEmpname);
		pnlInput.add(txtEmpname);

		pnlInput.add(lblDesignation);
		pnlInput.add(txtDesignation);

		pnlInput.add(lblDno);
		pnlInput.add(txtDno);
        frame.add(pnlInput);
        Panel pnlButton = new Panel(new FlowLayout());
		btnAdd = new Button("Add");
		btnAdd.addActionListener(this);
		pnlButton.add(btnAdd);
        frame.add(pnlButton, "South");
		//If this will not be written, the only frame will be closed
		// but the application will be active.
		
		frame.pack();
		frame.setVisible(true);
		frame.setSize(350, 350);
		
		frame.addWindowListener(new WindowAdapter()
        {
        	public void windowClosing(WindowEvent arg0) 
        	{
        		// TODO Auto-generated method stub
        		System.exit(0);
        	}
        });
	}
		
	public static void main(String[] args) 
	{
		JDBCExampleofDataEntry obj = new JDBCExampleofDataEntry();
		obj.createUI();
	}

	void clearControls() 
	{
		txtEmpcode.setText("");
		txtEmpname.setText("");
		txtDesignation.setText("");
		txtDno.setText("");	// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
	
		try
		{
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//Connection con = DriverManager.getConnection("Jdbc:Odbc:empdsn");
			Class.forName("com.mysql.jdbc.Driver");  
     		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");  

			
			String sql = "INSERT INTO pers (empcode,empname,designation,dno) " +
				"Values ('"+Integer.parseInt(txtEmpcode.getText())+"'," +
						"'"+txtEmpname.getText()+"'," +
						"'"+txtDesignation.getText()+"'," +
						"'"+txtDno.getText()+"')";

			Statement st = con.createStatement();
			st.executeUpdate(sql);
			clearControls();
		}
		catch(Exception e1) {}
	}
	}

