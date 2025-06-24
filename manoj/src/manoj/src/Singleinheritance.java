import java.util.Scanner;
class Base
{
	int empid;
	Scanner sc = new Scanner(System.in);
	void get()
	{
		System.out.println("Enter the empid is ");
		empid = sc.nextInt();
	}
}
class Derived extends Base
{
	void display()
	{
		System.out.println("The empid is "+empid);
	}
}
public class Singleinheritance {

	public static void main(String[] args) {
		Derived f1=new Derived();
		f1.get();
		f1.display();

	}

}
