package com.company;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.awt.*;
import java.util.Scanner;

class matrix{
    Scanner sc = new Scanner(System.in);
    int i,j,n,m;
    void rowcolm() {
        System.out.println("Enter Row and column");
        n = sc.nextInt();
        m = sc.nextInt();
    }
    int a[][] = new int[100][100];
    void get() {
        System.out.println("Get A:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();

            }
        }

    }
    void check()
    {
        int p = 2;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (a[i][j] == a[j][i])
                {
                    p=0;
                    break;

                } else
                {
                    p=1;
                    break;
                }
            }
        }
        if(p==0)
        {
            System.out.println("Matrice is symmatric");
        }
        else
            System.out.println("Matrice is not symmatric");

    }
}

public class symmteric {
    public static void main(String ...a){
        matrix m=new matrix();
        m.rowcolm();
        m.get();
        m.check();
    }
}
