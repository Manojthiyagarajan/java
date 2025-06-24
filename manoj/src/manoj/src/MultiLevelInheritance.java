import java.util.Scanner;
class b3
{
	int reg;
	String name;
	Scanner sc = new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the name:");
		name = sc.nextLine();
	}
}
class d1 extends b3
{
	void get2()
	{
		System.out.println("Enter the reg no: ");
		reg = sc.nextInt();	}
}
class d2 extends d1
{
	void display()
	{
		System.out.println("Your name is "+name);
		System.out.println("Your reg no is "+reg);
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		d2 f1 = new d2();
		f1.get1();
		f1.get2();
		f1.display();


	}

}
