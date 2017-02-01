package swings_programs;
import javax.swing.*;
import java.awt.*;
public class EmployeeInfo extends JFrame
{
EmployeeInfo()
{
	setTitle("Employee Info");
	JLabel lbl=new JLabel("Select Department Number");
	lbl.setBounds(150,50,200,50);
	add(lbl);
	String item[]={"1","2"};
	JComboBox jcb=new JComboBox(item);
	jcb.setBounds(150,100,200,20);
	add(jcb);
	String data[][]={{"e102","Manish","Programmer","2"},
			{"E105","Shubham","Analyst","2"},
	{"E107","Divya","CEO","2"},
	{"E109","Tarun","Trainee","2"},
	{"E110","Harry","Manager","2"}};
	String column[]={"Emp Code","Emp Name","Designation","Dept No"};
	JPanel p1=new JPanel(new FlowLayout());
	JTable jt=new JTable(data,column);
	//jt.setBounds(50,250,300,300);
	JScrollPane jsp=new JScrollPane(jt);
	p1.add(jsp);
	p1.setBounds(0,150,500,200);
	add(p1);
	setLayout(null);
	setSize(500,600);
	setVisible(true);
	}
	public static void main(String[] args) {
		new EmployeeInfo();

	}

}
