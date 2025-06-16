import java.util.Scanner;
class demo2
{
	int empid[][] = new int[5][5];
	int i,j,m,n;
	Scanner sc= new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the value of n is ");
		n=sc.nextInt();
		m=sc.nextInt();
	}
	void logic()
	{
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
		{
			System.out.println("Enter the empid is ");
			empid[i][j]=sc.nextInt();
			
		}
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
		{
			System.out.println("The empid is "+empid[i][j]);
		}
	}
}
public class Twodimensionalarray {

	public static void main(String[] args) {
		demo2 f1=new demo2();
		f1.input();
		f1.logic();

	}

}
