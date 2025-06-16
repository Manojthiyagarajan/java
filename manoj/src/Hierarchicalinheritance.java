import java.util.*;
class b2
{
	int a,b;
	Scanner sc = new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value of a is ");
		a=sc.nextInt();
		System.out.println("Enter the value of b is ");
		b=sc.nextInt();
	}
}
class d3 extends b2
{
	void display()
	{
		System.out.println("The sum of a and b is "+(a+b));
	}
}
class d4 extends b2
{
	void display1()
	{
		System.out.println("The product of a and b is "+(a*b));
	}
}
public class Hierarchicalinheritance {

	public static void main(String[] args) {
		d3 f1=new d3();
		f1.get1();
		f1.display();
		d4 f2=new d4();
		f2.get1();
		f2.display1();

	}

}
