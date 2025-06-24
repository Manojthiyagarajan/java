
public class Demo2 {
	String pname="apple";
	void get1()
	{
		int pid=101;
		System.out.println("This is get1 method "+pname+" "+pid);
	}
	void get2()
	{
		System.out.println("This is get2 methid "+pname);
	}
	public static void main(String[] args) {
		Demo2 f1=new Demo2();
		f1.get1();
		f1.get2();

	}

}
