import java.util.*;
class a
{
public static void main(String[] args)
{
	Scanner obj=new Scanner(System.in);
	
	int custid[]=new int[10];
	int pp[]=new int[10];
	int pq[]=new int[10];
	int tp[]=new int[10];
	int temp=0;
	int i;
	
	String custname[]=new String[10];
	
	for(i=0;i<3;i++)
	{
	System.out.println("customer id");
	custid[i]=obj.nextInt();
	
	System.out.println("customer name");
	custname[i]=obj.next();
	
	System.out.println("product price");
	pp[i]=obj.nextInt();

	System.out.println("quantity");
	pq[i]=obj.nextInt();
	}
	
	for(i=0;i<3;i++)
	{
	System.out.println(custname[i]);
	tp[i]=pp[i]*pq[i];
	System.out.println(tp[i]);
	}

	for(i=0;i<3;i++)
	{
	if(tp[i]>temp)
		{
		temp=tp[i];
		}
	}
		
	System.out.println("highest value");
	System.out.println(temp);
	
}
}	
	