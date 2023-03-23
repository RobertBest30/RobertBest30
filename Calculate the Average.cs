/* 4.Calculate the average of 5 test, 3 quizes, 2 homework grades entered and 
 * display your average is. However you must use a test method, quiz method, & 
 * homework method to calculate these averages.*/

using System;
using static System.Console;

namespace Average
{
    class Program
    {
        static void Main(string[] args)
        { 
            int test1;
            int test2;
            int test3;
            int test4;
            int test5;
            int testavg;

            int quiz1;
            int quiz2;
            int quiz3;
            int quizavg;

            int hw1;
            int hw2;
            int hwavg;

            double avg;

            WriteLine("Test 1: ");
            test1 = Convert.ToInt32(ReadLine());
            WriteLine("Test 2: ");
            test2 = Convert.ToInt32(ReadLine());
            WriteLine("Test 3: ");
            test3 = Convert.ToInt32(ReadLine());
            WriteLine("Test 4: ");
            test4 = Convert.ToInt32(ReadLine());
            WriteLine("Test 5: ");
            test5 = Convert.ToInt32(ReadLine());
            WriteLine("Quiz 1: ");
            quiz1 = Convert.ToInt32(ReadLine());
            WriteLine("Quiz 2: ");
            quiz2 = Convert.ToInt32(ReadLine());
            WriteLine("Quiz 3: ");
            quiz3 = Convert.ToInt32(ReadLine());
            WriteLine("Homework 1: ");
            hw1 = Convert.ToInt32(ReadLine());
            WriteLine("Homework 2: ");
            hw2 = Convert.ToInt32(ReadLine());
            WriteLine();

            testavg = ((test1 + test2 + test3 + test4 + test5) / 5);

            quizavg = ((quiz1 + quiz2 + quiz3) / 3);

            hwavg = ((hw1 + hw2) / 2);

            avg = ((testavg + quizavg + hwavg) / 3);
    
            WriteLine("Test Average is: " + testavg);
            WriteLine("Quiz Average is: " + quizavg);
            WriteLine("Homework Average is: " + hwavg);
            WriteLine("Average is: " + avg);
            ReadKey();
        }
    }
}

