/* Write a java program that requires you to enter 2 drivers, their birthdate, their age, and their vehicle.
 * Then print out each record using two dimensional array.
 */

public class TwoDimensionalArray
{
    public static void main(String args[])
    {
        String [][] a = {{"08131992", "30", "Chevy"}, {"08111994", "11", "Chevy"}};
        System.out.println("array elements are");
        for(int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.println(a[i][j]);
            }
        }
    }
}
