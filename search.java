import java.util.Scanner;

public class search {

	public static void main(String[] args) {
		int[] a=new int[100];
		int i,n,s;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter limit:");
		n=sc.nextInt();
		System.out.println("Enter "+n+" data:");
		for(i=1;i<=n;i++)
		{
			a[i]=sc.nextInt();			
		}
		System.out.println("Enter element to search:");
		s=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(s==a[i])
			{
				System.out.println(s+" Element found at "+i+" position");
				break;
			}
			if(i==n)
				System.out.println("Elemnt not found");
		}
	}

}




