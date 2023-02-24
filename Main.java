/* Wrote a program to check whether a number is divisible by 5, 11, or 12.
 */

import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = input.nextInt();
		
		if(num%5==0 && num%11==0 || num%12==0)
			System.out.println("This Number is Divisible by 5, 11, and 12");
		
		else
			System.out.println("This Number is Not Divisible by 5, 11, and 12");
	}
}
