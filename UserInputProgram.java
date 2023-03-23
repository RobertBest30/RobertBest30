/* Write a java program that requires the end user to enter 6 variables. 
 * These variables are to be 3 integers and 3 strings. 
 		* For the integers
 			* Pass the values to a method, performing a calculation can be any expression, 
			* multiply divide whatever. You are to then print the output. 
 		* For the strings
 			* Create three methods and pass the strings, 1 method to count the length, 1 
			* method to compare the three strings, and 1 method to make all uppercase. 
*/
import java.util.Scanner;

public class UserInputProgram 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first value: ");
		int val1 = input.nextInt();
		
		System.out.println("Enter your second value: ");
		int val2 = input.nextInt();
		
		System.out.println("Enter your third value: ");
		int val3 = input.nextInt();
		
		int result = Calculation(val1, val2, val3);
		System.out.println("\nThe result of your values is: " + result);
		
		System.out.println("\nEnter your first string: ");
		String str1 = input.next();

		System.out.println("Enter your second string: ");
		String str2 = input.next();
		
		System.out.println("Enter your third string: ");
		String str3 = input.next();

		int length1 = getStringLength(str1);
		int length2 = getStringLength(str2);
		int length3 = getStringLength(str3);
		
		boolean stringsEqual = compareStrings(str1, str2, str3);
        System.out.println("\nThe three strings are " + (stringsEqual ? "" : "not ") + "equal.");
        
        String str1Upper = convertToUpperCase(str1);
        String str2Upper = convertToUpperCase(str2);
        String str3Upper = convertToUpperCase(str3);
        System.out.println("\nThe uppercase versions of the three strings are: " + str1Upper + ", " + str2Upper + ", " + str3Upper);
	}
	
	public static int Calculation(int val1, int val2, int val3)
	{
		return val1 * val2 * val3;
	}
	
	public static int getStringLength(String str) 
	{   
		return str.length();
	}
	    
	public static boolean compareStrings(String str1, String str2, String str3) 
	{
		return str1.equals(str2) && str2.equals(str3);
	}
	    
	public static String convertToUpperCase(String str) 
	{	
		return str.toUpperCase();   	
	}	
}
