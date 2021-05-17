import java.util.Scanner;

public class employee {
	int eno,esalary;
	String ename;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		employee[] e=new employee[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the data:");
			e[i]=new employee();
			e[i].eno=sc.nextInt();
			e[i].esalary=sc.nextInt();
			e[i].ename=sc.next();
		}
		System.out.println("Enter the employee number:");
		int enoo=sc.nextInt();
		for(int i=0;i<3;i++)
		{
			if(e[i].eno==enoo)
			{
				System.out.println("Employee details:");
				System.out.println("name:"+e[i].ename+"\nemployee number:"+e[i].eno+"\nemployee salary:"+e[i].esalary);
				break;
			}
			if(i==3)
			{
				System.out.println("Employee not found:");
			}
		}


	}

}
