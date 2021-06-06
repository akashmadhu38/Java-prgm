package com.company;

import java.util.*;


class matr{
    Scanner sc = new Scanner(System.in);
    int n, m, n1, m1, i, j;

    void rowcol() {
        System.out.println("Enter the coloumn and row");
        System.out.println("row1");
        n = sc.nextInt();
        System.out.println("row2");
        n1 = sc.nextInt();
        System.out.println("coloumn1");
        m = sc.nextInt();
        System.out.println("coloumn2");
        m1 = sc.nextInt();
    }

    int a[][] = new int[100][100];
    int b[][] = new int[100][100];

    void geta() {
        System.out.println("Get A:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

    }

    void getb() {
        System.out.println("Get B:");
        for (i = 0; i < n1; i++) {
            for (j = 0; j < m1; j++) {
                b[i][j] = sc.nextInt();
            }
        }
    }

    void add() {
        if(n==n1 && m==m1) {
            System.out.println("SUM:\n");
            for(i=0;i<n;i++)
            {
                for(j=0;j<m1;j++)
                {
                    System.out.print(" "+(a[i][j] + b[i][j]));
                }
                System.out.println("");
            }
        }
    }

}
class matrice
{
public static void main(String ...a)
{
    matr m = new matr();
    m.rowcol();
    m.geta();
    m.getb();
    m.add();

}
}
