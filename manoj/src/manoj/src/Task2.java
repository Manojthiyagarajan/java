import java.util.Scanner;
class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark:");
		int mark=sc.nextInt();
		if(mark>=90 && mark<=100)
		{
			System.out.println("Grade A \n"+"Pass");
		}
		else if(mark>=80 && mark<=89)
		{
			System.out.println("Grade B\n"+"pass");
		}
		else if(mark>=70 && mark<=79)
		{
			System.out.println("Grade C\n"+"pass");
		}
		else if(mark>=60 && mark<=69)
		{
			System.out.println("Grade D\n"+"pass");
		}
		else if(mark<60)
		{
			System.out.println("Grade E\n"+"Fail");
		}

		sc.close();
	}

}
