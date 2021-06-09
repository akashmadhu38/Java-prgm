
  
import java.util.*;
public class product{
int pcode,price;
String pname;

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
product[] p=new product[3];
for(int i=0;i<3;i++)
{
	System.out.println("Enter the data:");
	p[i]=new product();
	System.out.println("product code:");
	p[i].pcode=sc.nextInt();
	System.out.println("product price:");
	p[i].price=sc.nextInt();
	System.out.println("product name:");
	p[i].pname=sc.next();
}

if(p[0].price<p[1].price && p[0].price<p[2].price)
{
	System.out.println(p[0].price+" is smallest");
}
else if(p[1].price<p[0].price && p[1].price<p[2].price)
{
	System.out.println(p[1].price+" is smallest");
}
else
{
	System.out.println(p[2].price+" is smallest");
}
}
}
