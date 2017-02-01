//class calling TelCall
import java.io.*;
class TelCall2
{
    public static void main(String args[])throws IOException 
	{
    	long pn;
    	String sn;
    	int numberOfCalls;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("ENTER THE PHONE NUMBER");
 pn=Long.parseLong(br.readLine());
 System.out.println("ENTER THE SUBSCRIBER NAME:");
 sn=br.readLine();
 System.out.println("ENTER THE NUMBER OF CALLS:");
 numberOfCalls=Integer.parseInt(br.readLine());
		//TelCall ob=new TelCall();
		TelCall obj=new TelCall(pn,sn,numberOfCalls);
		obj.compute();
		obj.display();
}

}
