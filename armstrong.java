import java.io.*;
import java.util.*;
class slip3
{
public static void main(string args[])
{
int check,rem=0;
int sum=0,num;
System.out.println("enter the number to check armstrong or not");
Scanner sc=new Scanner(System.in);
num=sc.nextlnt();
check=num;
while(check!=0)
{
rem=check%10;
sum=sum+(rem*rem*rem);
check=check/10;
}
if(num==sum)
System.out.println("the number is armstrong");
else
System.out.println("the number is not armstrong");
}
}