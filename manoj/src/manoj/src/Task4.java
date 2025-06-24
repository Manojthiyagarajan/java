import java.util.*;
public class Task4 {
	public static void main(String[] args) {
		String account_type,operation_type ,cbal;
		int bal,wid,dep,trs;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the TYPE of account :");
		account_type=sc.next();
		bal=50000;
		if(account_type.equalsIgnoreCase("savings"))
		{
			System.out.println("Want to withdraw or deposit or transferfunds or checkbalance ");
			operation_type=sc.next();
			if(operation_type.equalsIgnoreCase("withdraw"))
			{
				System.out.println("Enter the amount to be withdrawal ");
				wid=sc.nextInt();
				if(wid<=bal&&(bal-wid)>=100)
				{
				bal=bal-wid;
				System.out.println("The amount is withdrawal successfully!");
				}
				else
				{
					System.out.println("Insufficient Balance!!");
				}
			}
				
			else if(operation_type.equalsIgnoreCase("deposit"))
			{
				System.out.println("Enter the amount to deposit ");
				dep=sc.nextInt();
				bal=bal+dep;
				System.out.println("The amount is deposited successfully!");
			}
			else if(operation_type.equalsIgnoreCase("transferfunds"))
			{
				System.out.println("Enter the amount to transfer ");
				trs=sc.nextInt();
				if(bal>=trs&&(bal-trs)>=100)
				{
				bal=bal-trs;
				System.out.println("Transfered successfully!!");
				}
				else
				{
					System.out.println("Insufficient Balance!!");
				}
			}				
		}	
		else if(account_type.equalsIgnoreCase("checking"))
		{
			System.out.println("Want to withdraw or deposit or transferfunds or checkbalance ");
			operation_type=sc.next();
			if(operation_type.equalsIgnoreCase("withdraw"))
			{
				System.out.println("Enter the amount to be withdrawal ");
				wid=sc.nextInt();
				if(wid<=bal)
				{
				bal=bal-wid;
				System.out.println("The amount is withdrawal successfully!");
				}
				else
				{
					System.out.println("Insufficient Balance!!");
				}
			}
			else if(operation_type.equalsIgnoreCase("deposit"))
			{
				System.out.println("Enter the amount to deposit ");
				dep=sc.nextInt();
				bal=bal+dep;
				System.out.println("The amount is deposited successfully!");
			}
			else if(operation_type.equalsIgnoreCase("transferfunds"))
			{
				System.out.println("Enter the amount to transfer ");
				trs=sc.nextInt();
				if(bal>=trs)
				{
				bal=bal-trs;
				System.out.println("Transfered successfully!!");
				}
				else
				{
					System.out.println("Insufficient Balance!!SS");
				}
			}		
		}		
			System.out.println("Do you want checkbalance yes or no ");
			cbal=sc.next();
			if(cbal.equals("yes"))
			{
				System.out.println("The balance amount is "+bal);
				
			}
			else
			{
				System.out.println("Thanks for visiting!!");
			}	
			sc.close();
	}

}
