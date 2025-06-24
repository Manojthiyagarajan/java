import java.util.*;
public class Task3 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee performance ");
		n=sc.nextInt();
		if(n>=90)
		{
			System.out.println("The performance evalution of employees is "+n+"\nThe feedback given to employees "+"Excellent"+"\nThe employee is Recommended for bonus");
		}
		else if(n>=75 && n<=89)
		{
			System.out.println("The performance evalution of employees is "+n+"\nThe feedback given to employees "+"Good"+"\nThe employee is Recommended for Improvement");
		}
		else if(n>=50 && n<=74)
		{
			System.out.println("The performance evalution of employees is "+n+"\nThe feedback given to employees "+"Average"+"\nThe employee is Recommended for Improvement");
		}
		else if(n>=30 && n<=49)
		{
			System.out.println("The performance evalution of employees is "+n+"\nThe feedback given to employees "+"Below Average"+"\nThe Employee is Recommended for Additional Training");
		}
		else
		{
			System.out.println("The performance evalution of employees is "+n+"\nThe feedback given to employees "+"Poor"+"\nThe Employee is Recommended for Additional Training");
		}
		sc.close();

	}

}
