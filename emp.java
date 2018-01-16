
import java.util.*;
class a
{

public static void main(String[] args)
{
	Scanner obj=new Scanner(System.in);
	
	int empid[]=new int[10];
	 float empsal[]=new float[10];
	float newsal[]=new float[10];
	
	float temp=0;
	int i;
	
	String empname[]=new String[10];
	
	for(i=0;i<10;i++)
	{
	System.out.println("emp id");
	empid[i]=obj.nextInt();
	
	System.out.println("emp name");
	empname[i]=obj.next();
	
	System.out.println("emp sal");
	empsal[i]=obj.nextInt();

	}
	
	for(i=0;i<10;i++)
	{
	newsal[i]=empsal[i]*0.10*10+empsal[i];
	}

	for(i=0;i<10;i++)
	{
	if(newsal[i]>temp)
		{
		temp=newsal[i];
		}
	}
		
	System.out.println("highest sal");
	System.out.println(temp);
}
} 