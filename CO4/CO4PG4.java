package src.CO4;

import java.io.*;
import java.util.*;

class readnum{
    int a[] = new int[100];
    String fname;
    void getname() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name (.text):");
        fname = sc.next();
        for (int i = 0;i<5;i++){
            a[i] = sc.nextInt();
        }
    }
    void writefile() throws Exception{
        Scanner sc = new Scanner(System.in);
        PrintWriter wr = new PrintWriter(new FileWriter(fname));
        for (int i=0;i<5;i++){
                wr.write(a[i]+"\n"+"");

        }
        wr.close();
    }
    void readfile() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(fname));
        PrintWriter wr = new PrintWriter(new FileWriter("even.text"));
        PrintWriter wr1 = new PrintWriter(new FileWriter("odd.text"));
        String st;
        while ((st = br.readLine()) != null) {

            int x = Integer.parseInt(st);
            if(x%2==0)
            {
                wr.write(x+"\n"+"");
            }
            else
            {
                wr1.write(x+"\n"+"");
            }
        }
        wr.close();
        wr1.close();
    }
    void even() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("even.text"));
        System.out.println("Even");
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
    void odd() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("odd.text"));
        System.out.println("Odd");
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}
public class CO4PG4 {
    public static void main(String ...a) throws Exception {
        readnum r = new readnum();
        r.getname();
        r.writefile();
        r.readfile();
        r.even();
        r.odd();
    }
}
