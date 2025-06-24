import java.util.Scanner;
public class FibSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int next=0,first=0 ,second=1,n;
		System.out.println("Enter the value for n :");
		n=sc.nextInt();
		System.out.print("FibSeries is");
		for(int i=0;i<n;i++)
		{
			if(i<=1)
			{
				next=i;
			}
			else
			{
			next=first+second;
			first=second;
			second=next;
		}
		System.out.print(" "+next);

	}
sc.close();
}

}
