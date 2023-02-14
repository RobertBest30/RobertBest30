"""
Program:calculator.py
Author: Bobby Best
Project: Final Exam
"""

"""
1. Create a program that takes input from the user.
2. Allow any kind of calculation and display the outputs.
3. Program has to have a loop and a function.
"""

# Define our function
def calculate():
    operation = input('''
Please type in the math operation you would like to complete:
+ for addition
- for subtraction
* for multiplication
/ for division
''')

    number_1 = int(input('Please enter the first number: '))
    number_2 = int(input('Please enter the second number: '))

    if operation == '+':
        print('{} + {} = '.format(number_1, number_2))
        print(number_1 + number_2)

    elif operation == '-':
        print('{} - {} = '.format(number_1, number_2))
        print(number_1 - number_2)

    elif operation == '*':
        print('{} * {} = '.format(number_1, number_2))
        print(number_1 * number_2)

    elif operation == '/':
        print('{} / {} = '.format(number_1, number_2))
        print(number_1 / number_2)

# Let the user know they did not meet a specific requirement
    else:
        print('You have not typed a valid operator, please run the program again.')
        
        # Adding again() function to calculate() users inputs again
        again()

def again():
    calc_again = input('''
Do you want to run another calculation?
Please type Y for yes and N for no.
''')
    if calc_again.upper() == 'Y':
        calculate()
    elif calc_again.upper() == 'N':
        print('Thanks for coming!')
    else:
        again()

# Call calculate() outside of the function
calculate()