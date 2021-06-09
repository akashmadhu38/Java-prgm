package com.company;
import java.util.*;
class overload{
    Scanner sc=new Scanner(System.in);
    int length,breath;
    void get()
    {
        System.out.println("Enter Length and Breath for rectangle:");
        length=sc.nextInt();
        breath=sc.nextInt();
    }
    void area(){
        System.out.println("Area of rectangle:"+(length*breath));
    }
    void area(double pi,int breath,int height){
        System.out.println("Area of triangle:"+(pi*breath*height));
    }
}
public class Myclass {
    public static void main(String ...a) {
        Scanner sc=new Scanner(System.in);
        overload ar = new overload();
        ar.get();
        ar.area();
        System.out.println("Enter Base and height for triangle");
        int c=sc.nextInt();
        int b=sc.nextInt();
        ar.area(0.5, c,b);
    }

}
