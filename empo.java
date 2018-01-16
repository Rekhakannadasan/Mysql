import java.util.*;
class emp
{
public static void main(String[] args)
{
Scanner obj=new Scanner (System.in);

int empid[]=new int[10];
int empage[]=new int[10];
int empsal[]=new int[10];
String empname[]=new String[10];
String empgender[]=new String[10];
String empcity[]=new String[10];
String empcountry[]=new String[10];
String empdept[]=new String[10];
String empmar[]=new String[10];
int count=0;
int count1=0;
int count2=0;
int count3=0;



for(i=0;i<5;i++)
{
empid[i]=obj.nextInt();
empage[i]=obj.nextInt();
empsal[i]=obj.nextInt();
empname[i]=obj.next();
empgender[i]=obj.next();
empcityp[i]=obj.next();
empcountry[i]=obj.next();
System.out.println(" hr, marketing,finace,operations");
empdept[i]=obj.next();
empmar[i]=obj.next();
}

for(i=0;i<5;i++)
{
if(empgender[i]=="male" && empmar[i]=="married")
System.out.println(empname[i]);
}

for(i=0;i<5;i++)
{
if(empdept[i]=="hr")
count++;

else if(empdept[i]=="marketing")
count1++;

else if(empdept[i]=="finace")
count2++;

elseif empdept[i]=="operations")
count3++;
}

System.out.println(count);
System.out.println(count1);
System.out.println(count2);
System.out.println(count3);

for(i=0;i<5;i++)
{
if(empage[i]>60)
System.out.println(empname[i]);
}

for(i=0;i<5;i++)
{
if(empgender[i]=="female" && empcountry[i]=="india")
System.out.println(empname[i]);
}

}
}



