import java.util.Scanner;


public class employees {
	int eno,esalary;
	String ename;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		employees[] e=new employees[3];
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the data:");
			e[i]=new employees();
			System.out.println("Enter the Id:");
			e[i].eno=sc.nextInt();
			System.out.println("Enter the salry:");
			e[i].esalary=sc.nextInt();
			System.out.println("Enter the name:");
			e[i].ename=sc.next();
		}
		System.out.println("Enter the employee number:");
		int enoo=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(e[i].eno==enoo)
			{
				System.out.println("Employee details:");
				System.out.println("name:"+e[i].ename+"\nemployee number:"+e[i].eno+"\nemployee salary:"+e[i].esalary);
				break;
			}
			if(i==n-1)
			{
				System.out.println("Employee not found:");
			}
		}


	}

}