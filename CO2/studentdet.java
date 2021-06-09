package com.company;

import java.util.*;

class student {
    int mark,roll;
    String name,classname;
    Scanner sc = new Scanner(System.in);
   void stude()
   {
       System.out.println("Name:");
       name= sc.next();
       System.out.println("Roll no:");
       roll=sc.nextInt();
       System.out.println("class name:");
       classname=sc.next();
       System.out.println("Enter marks out of 80:");
       mark=sc.nextInt();
   }

}
class sports extends student{
    Scanner sc = new Scanner(System.in);
    int marks;
    void get()
    {
        System.out.println("Enter marks out of 20:");
        marks=sc.nextInt();
    }
}

class result extends sports
{
    void displ()
    {
        System.out.println("Details of students are:");
        System.out.println("Name:"+name);
        System.out.println("Roll number:"+roll);
        System.out.println("Class Name:"+classname);
        System.out.println("Academic Mark:"+mark);
        System.out.println("Sports Mark:"+marks);
    }
}
public class studentdet {
    public static void main(String ...a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        result res[]=new result[n];
        for (int i=0;i<n;i++)
        {
            res[i]=new result();
            res[i].stude();
            res[i].get();
            res[i].displ();
        }
    }
}

