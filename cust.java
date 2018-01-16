import java.util.*;
class customer
{
public static void main(String[] args)
{
Scanner obj=new Scanner (System.in);

int custid[]=new int[10];
int custage[]=new int[10];
double int custphone[]=new int[10];
String custname[]=new String[10];
String custgender[]=new String[10];
String custcity[]=new String[10];
String custcountry[]=new String[10];
String custhobby[]=new String[10];
int count=0;



int count1=0;
int count2=0;
int count3=0;
int count4=0;
int count5=0;

for(i=0;i<5;i++)
{
custid[i]=obj.nextInt();
custage[i]=obj.nextInt();
custphone[i]=obj.nextInt();
custname[i]=obj.next();
custgender[i]=obj.next();
custcity[i]=obj.next();
custcountry[i]=obj.next();
custhobby[i]=obj.next();
}

for(i=0;i<5;i++)
{
if(custgender[i]=="male")
count++;
}

for (i=0;i<5;i++)
{
if(custgender[i]=="female")
count1++;
}

for(i=0;i<5;i++)
{
if(custage[i]>60)
count2++;
}

for(i=0;i<5;i++)
{
if(custhobby[i]=="traveling")
count3++;
}

for(i=0;i<5;i++)
{
if(custcountry[i]=="india" && custcountry[i]=="usa")
count4++;
}

for(i=0;i<5;i++)
{
if(custphone[i]=="null" && custphone[i]=="  ")
count5++;
}

System.out.println(count);
System.out.println(count1);
System.out.println(count2);
System.out.println(count3);
System.out.println(count4);
System.out.println(count5);

}
}

