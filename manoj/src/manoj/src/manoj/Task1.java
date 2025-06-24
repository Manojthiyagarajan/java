package manoj;
import java.util.Scanner;
class sample1
{
	int n;
	Scanner sc = new Scanner(System.in);
	void get()
	{
		System.out.println("Enter the Value of n:");
		n = sc.nextInt();
		if(n%2!=0)
		{
			System.out.println("Weird");
		}
		else if(n%2==0 && n>=2 && n<=5)
		{
			System.out.println("Not Weird");
		}
		else if(n%2==0 && n>=6 && n<=20)
		{
			System.out.println("Weird");
		}
		else if(n%2==0 && n>20)
		{
			System.out.println("Not Weird");
		}

	}
}
public class Task1 {

	public static void main(String[] args) {
		sample1 f1=new sample1();
		f1.get();


	}

}
