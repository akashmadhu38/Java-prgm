
import java.util.*;

class sortStr{
    String[] arr = new String[100];
    int len;
    void getStr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit:");
        len = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i=0;i< len;i++){
            arr[i] = sc.next();
        }
    }
    void sortString(){
        for (int i=0;i<len-1;i++){
            for (int j=i+1;j<len;j++){
                if(arr[i].compareTo(arr[j])>0){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    void dispStr(){
        System.out.println("Ascending order:");
        for (int i=0;i< len;i++){
            System.out.println(arr[i]);
        }
        System.out.println("\nDescending order:");
        for (int i=len-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}

public class CO3PG7{
    public static void main(String ...a){
        sortStr s = new sortStr();
        s.getStr();
        s.sortString();
        s.dispStr();
    }
}