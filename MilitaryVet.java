/* Build the code to enter 3 grades, and if they are a Military Vet. 
 * If the three grades are an average of 90 or higher AND military Vet, 
 * display you have received a scholarship, else display their final average.
 */

import java.util.Scanner;

public class MilitaryVet 
{

	public static void main(String[] args)
	{
		int grade1, grade2, grade3, choice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first grade: ");
		grade1 = input.nextInt();
		
		System.out.println("Enter your second grade: ");
		grade2 = input.nextInt();
		
		System.out.println("Enter your third grade: ");
		grade3 = input.nextInt();
		
		System.out.println("Are your a Military Vet. 1 for Yes and 2 for No ");
		choice = input.nextInt();
		
		int avg = (grade1 + grade2 + grade3)/ 3;
		
		if(avg >= 90 && choice == 1)
		{
			System.out.println("Congrats you have recieved a scholarship");
		}
		
		else
		{
			System.out.println("Your final average is an: " + avg);
		}
	}

}
