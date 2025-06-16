import java.util.Scanner;
class demo1
{
	int empid[] = new int[5];
	int i,n;
	Scanner sc= new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the value of n is ");
		n=sc.nextInt();
	}
	void logic()
	{
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the empid is ");
			empid[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.println("The empid is "+empid[i]);
		}
	}
}
public class onedimensionalarray {

	public static void main(String[] args) {
		demo1 f1=new demo1();
		f1.input();
		f1.logic();

	}

}
