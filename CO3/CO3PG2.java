package src.CO3;
import java.util.*;
class Investment{
    Scanner sc = new Scanner(System.in);
    double amount,intrest;
    void intrest(double a){
        System.out.println("Enter the amount to claculate intrest");
        amount = sc.nextDouble();
        intrest = amount*a;
        System.out.println("Intrest as per amount is:"+intrest);
    }
    void menu(){
        int choice;
        do{
            System.out.println("\n1.Fedral Bank\n2.Karur Bank\n3.BOI Bank\n4.Exit\nEnter the choice:");
            choice = sc.nextInt();
            switch (choice){
                case 1:intrest(8.4f/100f);
                break;
                case 2:intrest(7.3f/100f);
                break;
                case 3:intrest(9.7f/100f);
                break;
                case 4:System.exit(0);
                break;
                default:System.out.println("INVALID");
                break;
            }
        }while (choice!=4);
    }
}
public class CO3PG2 {
    public static void main(String ...a){
        Investment i = new Investment();
        i.menu();
    }
}
