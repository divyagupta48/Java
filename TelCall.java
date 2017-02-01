//class TelCall
public class TelCall
{
	long phno;
	String sname;
	int n;
	float amt;
	TelCall()//default constructor
	{
		phno=0;
		sname=" ";
		n=0;
		amt=0.0f;
	}
	TelCall(long pn,String sn,int n1)//Parameterized constructor
	{
		phno=pn;
		sname=sn;
		n=n1;
	}
	void compute()
	{
		if(n>=1&&n<=100)
			{
			amt=500.0f;
			}
		else if(n>=101&&n<=200)
		{
		amt=500+(1*(n-100));
		}
		else if(n>=201&&n<=300)
		{
		amt=500+1*100+(1.20f*(n-200));
		}
		else
		{
		amt=500+1*100+(1.20f*100)+(1.50f*(n-300));
		}
		}
	void display()
	{
		System.out.println("\t\t\t\t BHARAT SANCHAR NIGAM");
		System.out.print("Subscriber name:"+sname);
		System.out.println("\t\t\t\t\tContact:"+phno);
		System.out.print("No. of calls made:"+n);
		System.out.println("\t\t\t\t\tBILL AMOUNT:"+amt+"Rupees");
	}
}
