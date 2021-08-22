
import java.util.*;

class customer{
    String name,bank;
    int accno,amnt;
    customer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        name = sc.next();
        System.out.println("Enter Bank:");
        bank = sc.next();
        System.out.println("Accno:");
        accno = sc.nextInt();
        System.out.println("Enter Amount:");
        amnt = sc.nextInt();
    }
}

class Investment {
    static void intrest(customer c){
        switch (c.bank){
            case "fedral":System.out.println("Intrest at fedral:"+(c.amnt*(8.4f/100f)));
                break;
            case "Karur":System.out.println("Intrest at Karur:"+(c.amnt*(7.3f/100f)));
                break;
            case "BOI":System.out.println("Intrest at BOI:"+(c.amnt*(9.7f/100f)));
                break;
            default:System.exit(0);
                break;
        }

    }

}

public class CO3PG2 {
    public static void main(String ...a){
        customer c = new customer();
        Investment.intrest(c);
    }
}
