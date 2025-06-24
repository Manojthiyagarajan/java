import java.util.Scanner;
public class NestedIfelse {
	int age,sal,bns;
	Scanner sc = new Scanner(System.in);
	void get()
	{
		System.out.println("Enter the age ");
		age=sc.nextInt();
	}
	void get2()
	{
	if(age>=50)
	{
		System.out.println("Enter your Salary ");
		sal=sc.nextInt();
		if(sal>=20000)
		{
			bns=sal+500;
			System.out.println("Your Salary is "+bns);
		}
		else
		{
			bns=sal+1000;
			System.out.println("Your Salary is "+bns);
		}
	}
	else
	{
		System.out.println("Your age is low");
	}
	}
	public static void main(String[] args) {
		NestedIfelse f1=new NestedIfelse();
		f1.get();
		f1.get2();


	}

}
