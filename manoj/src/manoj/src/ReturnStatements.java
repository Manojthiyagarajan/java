import java.util.Scanner;
public class ReturnStatements {
	int a,b;
	Scanner sc = new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the value for a and b ");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	String get1()
	{
		if(a==b)
		{
			return "It is equal";
		}
		else
		{
			return "It is not equal";
		}
	}



	public static void main(String[] args) {
		ReturnStatements f1= new ReturnStatements();
		f1.input();
		String result=f1.get1();//get the return value
		System.out.println(result);//print the result

	}

}
