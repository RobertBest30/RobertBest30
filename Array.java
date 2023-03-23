// Write a program to Sort Numeric Array In Ascending Order
import java.util.Scanner;

public class Array 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] array = new int [] {7, 4, 5, 6, 1};
		int temp = 0;
		
		System.out.println("Original Array: ");
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + "");
		}
		
		for (int i = 0; i < array.length; i++)
		{
			for(int j = i+1; j <array.length; j++)
			{
				if(array[i] > array[j])  
		            temp = array[i];    
		            array[i] = array[j];    
		            array[j] = temp;    
			}
		}
		
		System.out.print("\nArray in Ascending Order: ");
		for (int i = 0; i < array.length; i++) 
		{     
		     System.out.print(array[i] + " ");    
		 }  	
	}
}    