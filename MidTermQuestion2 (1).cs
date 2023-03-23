/* 2. Write a function that takes an integer minutes and converts it to seconds.*/

using System;
using static System.Console;

namespace Minutes
{
    class Program
    {
        static void Main(string[] args)
        {

            int minutes;
            int seconds;

            WriteLine("Enter Minutes: ");
            minutes = Convert.ToInt32(ReadLine());

            seconds = (minutes * 60);

            WriteLine(seconds);
            ReadKey();
        }
    }
}