/********************************************************************************************
 * Author's name: Rana Islam
 ********************************************************************************************/
import java.util.*;
public class JavaPractice 
{
	public static void main(String[] args)
	{
		
		
		double packageA = 9.95;
		double packageA_Hours = 10.00;
		double packageA_Additional_Hours_Fees = 2.00;
		
		double packageB = 13.95;
		double packageB_Hours = 20.00;
		double packageB_Additional_Hours_Fees = 1.00;
		
		double packageC = 19.95;
		
		double additionalHours = 0;
		double result;
		
		System.out.print("Enter the letter of package (A, B, or C) to calculate the monthly bill: ");
		Scanner keyboard = new Scanner(System.in);
		String inputPackage = keyboard.nextLine();
		char inputPackageChar = inputPackage.charAt(0);
		
		
		if(inputPackageChar == 'A' || inputPackageChar == 'a')
		{
			System.out.print("Please enter number of hours you used: ");
			double packageA_Additional_Hours = keyboard.nextDouble();
			if(packageA_Additional_Hours > 10)
			{
				additionalHours = packageA_Additional_Hours - 10;
				result = packageA + (additionalHours * packageA_Additional_Hours_Fees);
				
			}
			else 
			{
				result = packageA;
			}
			System.out.println("$" + result);
		}
		else if(inputPackageChar == 'B' || inputPackageChar == 'b')
		{
			System.out.print("Please enter number of hours you used: ");
			double packageB_Additional_Hours = keyboard.nextDouble();
			if(packageB_Additional_Hours > 20)
			{
				additionalHours = packageB_Additional_Hours - 20;
				result = packageB + (additionalHours * packageB_Additional_Hours_Fees);
				
			}
			else 
			{
				result = packageB;
			}
			System.out.println("$" + result);
		}
		else if(inputPackageChar == 'C' || inputPackageChar == 'c')
		{
			result = packageC;
			System.out.println("$" + result);
		}
		else
		{
			System.out.println("Please enter the valid package (A, B, or C): ");
		}
	}
}
