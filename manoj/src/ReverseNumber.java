import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,rev=0;
		System.out.println("Enter the value for n:");
		n=sc.nextInt();
		while(n!=0)
		{
			rev=rev*10;
			rev = rev+n%10;
			n=n/10;
		}
		System.out.println("Reverse Number is "+rev);

	}

}
