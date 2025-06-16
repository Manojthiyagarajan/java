import java.util.*;
class b
{
	int empid;
	Scanner sc = new Scanner(System.in);
	void get()
	{
		System.out.println("Enter the empid is ");
		empid = sc.nextInt();
	}
}
class d extends b
{
	void display()
	{
		System.out.println("The empid is "+empid);
	}
}
public class singleinheritance {

	public static void main(String[] args) {
		d f1=new d();
		f1.get();
		f1.display();
		
	}

}
