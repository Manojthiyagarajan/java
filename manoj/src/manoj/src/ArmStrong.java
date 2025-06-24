import java.util.Scanner;
public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,rem,temp,s=0;
		System.out.println("Enter the value for n:");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10;
			s=s+rem*rem*rem;
			n=n/10;
		}
		if(temp==s)
		{
			System.out.println(s+" It is an ArmStrong Number");
		}
		else
		{
			System.out.println(s+" Not an ArmStrong Number");
		}
sc.close();
	}

}
