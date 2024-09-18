import java.lang.*;
import java.io.*;
class leap
{
public static void main(string args[]);
{
BufferdReader br=newBufferdReader(new input StreamReader(System.in));
int year=Integer.pressInt(br.readline());
if(year%100==0 && year%400=0)
System.out.println("it is leap");
else
System.out.println("it is not leap");
}
}