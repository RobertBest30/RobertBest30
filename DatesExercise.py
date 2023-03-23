"""
Program:dateconversion.py
Author: Bobby Best
Project: Exercise
"""
# Enter Filename
file = input("enter the file here: ")

# Open File
f = open(file, 'r')

# Read each line and compare 
while True:
   line = f.readline()
   data = line
   if data == "":
       break
   dataMod =data.replace(",", " ")
   dataMod2 = dataMod.lower()
   month, day, year = dataMod2.split()
   
   # If month is not properly formatted, format properly
   if month == 'january':
       month2 =  month.replace('january', '01')
   elif month == 'february':
       month2 = month.replace('february', '02')
   elif month == 'march':
       month2 = month.replace('march', '03')
   elif month == 'april':
       month2 = month.replace('april', '04')
   elif month == 'may':
       month2 = month.replace('may', '05')
   elif month == 'june':
       month2 = month.replace('june', '06')
   elif month == 'july':
       month2 = month.replace('july', '07')
   elif month == 'august':
       month2 = month.replace('august', '08')
   elif month == 'september':
       month2 = month.replace('september', '09')
   elif month == 'october':
       month2 = month.replace('october', '10')
   elif month == 'november':
       month2 = month.replace('november', '11')
   elif month == 'december':
       month2 = month.replace('december', '12')
   normalForm = year + month2 + day
   print(normalForm, ":", data)