import java.util.*;

class rect extends Thread {
    int len, bre, hei;

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        len = sc.nextInt();
        System.out.println("Enter breath:");
        bre = sc.nextInt();
        System.out.println("Area of rectangle:"+len * bre);
    }

}
class sqr extends Thread{
int len;
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side:");
        len = sc.nextInt();
        System.out.println("Area of square:"+len * len);
    }

}
class tri implements Runnable {
    int len, bre, hei;

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base:");
        bre = sc.nextInt();
        System.out.println("Enter height:");
        hei = sc.nextInt();
        System.out.println("Area of triangle:"+0.5f * bre * hei);
    }

}
class cir implements Runnable{
    int len;
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        len = sc.nextInt();
        System.out.println("Area of circle:"+3.14f * len);
    }

}

public class CO4PG1 {
    public static void main(String ...a)throws Exception{
        Scanner sc = new Scanner(System.in);
        rect t1 = new rect();
        sqr t2 = new sqr();
        tri r1 = new tri();
        cir r2 = new cir();
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r2);
        int c;
        do{
            System.out.println("\n1.Area of rectangle\n2.Area of square\n3.Area of triangle\n4.Area of circle\n5.Exit\noption:");
            c = sc.nextInt();
            switch (c){
                case 1:t1.start();
                t1.join();
                break;
                case 2:t2.start();
                t2.join();
                break;
                case 3:t3.start();
                t3.join();
                break;
                case 4:t4.start();
                t4.join();
                break;
                case 5:System.exit(0);
                break;
                default:System.out.println("Invalid");
                break;
            }
        }while (c!=5);
    }
}
