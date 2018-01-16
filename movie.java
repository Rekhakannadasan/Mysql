import java.util.*;
class movie
{
public static void main(String[] args)
{
Scanner obj=new Scanner (System.in);
int movid[]=new int[10];
int movrating[]=new int[10];
String movname[]=new String[10];
String movactor[]=new String[10];
String movdir[]=new String[10];
String movreldate[]=new String[10];
int count=0;
int count1=0;
int count2=0;


for(i=0;i<5;i++)
{
movid[i]=obj.nextInt():
movrating[i]=obj.nextInt();
movname[i]=obj.next();
movactor[i]=obj.next();
movdir[i]=obj.next();
movreldate[i]=obj.next();
}


for(i=-;i<5;i++)
{
if(movrating[i]>5)
count++;
}

for(i=0;i<5;i++)
{
if(movactor[i]=="amitab bachan")
count1++;
}

for(i=0;i<5;i++)
{
if(movdir[i]=="karanjohar")
count2++;
}

System.out.println(count);
System.out.println(count1);
System.out.println(count2);
}
}





