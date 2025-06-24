import java.util.Scanner;
class Demo
{
	int a,b;
	Scanner sc = new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the value for a and b ");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	void ifelse()
	{
		if(a==b)
		{
			System.out.println("It is equal");
		}
		else
		{
			System.out.println("It is not equal");
		}
	}
}
public class ControlStatementP1 {

	public static void main(String[] args) {
		Demo f1=new Demo();
		f1.input();
		f1.ifelse();

	}

}
