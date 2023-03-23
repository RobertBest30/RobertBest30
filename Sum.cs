/* 1. Create a function that takes two numbers as arguments and returns their sum.*/

using System;
using static System.Console;

namespace Sum
{
    class Program
    {
        static void Main(string[] args)
        {
            int num1;
            int num2;
            int sum;

            WriteLine("Enter First Number: ");
            num1 = Convert.ToInt32(ReadLine());
            WriteLine("Enter Second Number: ");
            num2 = Convert.ToInt32(ReadLine());
            sum = num1 + num2;
            WriteLine("\nSum of Number 1 and Number 2: " + sum);
            ReadKey();
        }
    }
}
