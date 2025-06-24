import java.util.Scanner;
public class Arrayp1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,max=0,max1=0;
		System.out.println("Enter the value for n:");
		n=sc.nextInt();
		int arr[] =  new int[n];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();

		}

		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}

		}
		for(int i=0; i<=arr.length-1;i++)
		{
		if(arr[i]!=max && arr[i]>max1)
		{
			max1=arr[i];
		}
		}
		System.out.println("The maximum of 1st element in an array is "+max);
		System.out.println("The maximum of 2nd element in an array is "+max1);
		sc.close();
	}

}
