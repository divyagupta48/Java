import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LayoutManager extends JFrame 
 {
	JButton addDealer,delete,update;
	JPanel p1,p2;
	JTable jt;
public void frame()
  {
	addDealer=new JButton("Add Dealer");
	delete=new JButton("Delete Dealer");
	update=new JButton("Update Dealer");
	p2=new JPanel(new GridLayout(1,3));
	p2.add(addDealer);
	p2.add(delete);
	p2.add(update);
	add(p2);
 setLayout(new FlowLayout());
  setTitle("Dealers");
  setSize(500,200);
  setVisible(true);
  setResizable(true); 
  String data[][]={{"","","","",""},{"","","","",""},{"","","","",""},{"","","","",""},
			{"","","","",""},{"","","","",""},
	{"","","","",""},{"","","","",""},
	{"","","","",""},{"","","","",""},
	{"","","","",""},{"","","","",""}};
	String column[]={"Id","Name","Contact","Email_Id","Address"};
	 p1=new JPanel(new BorderLayout(3,3));
	jt=new JTable(data,column);
	p1.add(jt,BorderLayout.CENTER);
	JScrollPane jsp=new JScrollPane(jt);
	p1.add(jsp,BorderLayout.EAST);
	add(p1);
	setResizable(false);
   }
public static void main(String[] args) {
		new LayoutManager().frame();

	}

}
