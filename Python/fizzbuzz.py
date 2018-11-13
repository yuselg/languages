#!/usr/bin/env python3
# Write a program that prints the numbers from 1 to 100. 
# But for multiples of "three print 'Fizz' instead of the number 
# and for the multiples of five print 'Buzz'. 
# For numbers which are multiples of both three and five print 'FizzBuzz'.

print("Enter the Fizzbuzz limit:")
limit = int(input())

for x in range(1,limit+1): # this is range 1..15
	s = ""
	if x % 3 == 0:
		s += "Fizz"
	if x % 5 == 0:
		s += "Buzz"
	if s == "":
		s = x
	print (s)