import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,sum=0,rem;
		System.out.println("Enter the value for n:");
		n=sc.nextInt();
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
		sc.close();
	}

}
