package com.company;
import java.util.*;
interface order
{
    void order_det();
}
class product_det implements order {
    Scanner sc = new Scanner(System.in);
    int pid,quant,price,totals,ord_no;
    String date,name;
    @Override
    public void order_det()
    {
        System.out.println("Enter the product details:");
        System.out.println("DATE:");
        date=sc.next();
        System.out.println("Order number:");
        ord_no=sc.nextInt();
        System.out.println("Product Id:");
        pid=sc.nextInt();
        System.out.println("Name:");
        name=sc.next();
        System.out.println("Quantity:");
        quant=sc.nextInt();
        System.out.println("Unit price:");
        price=sc.nextInt();
        System.out.println("Total:"+(price*quant));
    }
    void displa()
    {
        System.out.println("Details are:");
        System.out.println("DATE:"+date);
        System.out.println("Order number:"+ord_no);
        System.out.println("Product Id:"+pid);
        System.out.println("Name:"+name);
        System.out.println("Quantity:"+quant);
        System.out.println("price:"+price);
        System.out.println("Total:"+(price*quant));

    }

}
public class CO7 {
    public static void main(String ...a)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        int sum=0,te=0;
        product_det p[]=new product_det[n];
        for (int i=0;i<n;i++)
        {
            p[i]= new product_det();
            p[i].order_det();
            p[i].displa();
            sum+=p[i].price*p[i].quant;
        }
        te+=sum;
        System.out.println("Grand Total:"+sum);
    }
}
