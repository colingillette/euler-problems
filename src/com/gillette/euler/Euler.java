package com.gillette.euler;

import java.util.*;

/*
 * A class that holds the Euler problems so that they can be accessed later.
 */

public class Euler {
	
	/*
	 * multiplesOfThreeFive(n)
	 * 
	 * Problem 1: Multiples of 3 and 5
	 * Find the sum of all multiples of 3 and 5 from a range of 1 to n.
	 * 
	 * @param {Integer} n -> The inclusive end of range.
	 * @return {Integer} -> The sum of all multiples of 3 and 5 up through n.
	 */
	public int multiplesOfThreeFive(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	
	/*
	 * evenFibonacci(n)
	 * 
	 * Problem 2: Even Fibonacci Numbers
	 * Returns the sum of all even Fibonacci numbers of sequence length n
	 * 
	 * @constraint -> n > 3. Have safety in place if not true.
	 * @param {Integer} n -> The length of the sequence.
	 * @return {Integer} -> The sum of the even numbers in the sequence of length n.
	 */
	public int evenFibonacci(int n) {
		int sum = 0;
		ArrayList<Integer> sequence = new ArrayList<Integer>();
		
		// Safety if constraint is not followed.
		if (n < 3) {
			return n == 2 ? 2 : 0;
		}
		
		for (int i = 0; i < n; i++) {
			// We're starting with 1
			if (i == 0) {
				sequence.add(1);
			}
			// Our constraint allows us to manually enter 2 as well
			else if (i == 1) {
				sequence.add(2);
				sum += 2;
			}
			// All other numbers follow this process
			else {
				sequence.add(sequence.get(i-1) + sequence.get(i-2));
				if (sequence.get(i) % 2 == 0) {
					sum += sequence.get(i);
				}
			}
		}
		
		return sum;
	}
	
	/*
	 * smallestMultiple()
	 * 
	 * Problem 5: What is the smallest number that can be divided by all numbers from 1 to 20?
	 * The smallest number for 1 to 10 is 2520
	 * 
	 * @return {Integer} -> Smallest divisible number
	 */
	public int smallestMultiple() {
		
		boolean breaker = false;
		int n = 2520;
		
		while (!breaker) {
			for (int i = 2; i <= 20; i++) {
				if (n % i != 0) {
					break;
				}
				
				if (i == 20 && n % i == 0) {
					breaker = true;
				}
			}
			
			n += 10;
		}
		
		return n;
	}
	
	/*
	 * sumSquareDifference(n)
	 * 
	 * Problem 6: What is the difference between the sum of the squares (each num squared) and the square of the sum (all nums summed and squared)
	 * to first n numbers?
	 * 
	 * @param {Integer} -> The number to increment to.
	 * @return {Integer} -> The difference
	 */
	public long sumSquareDifference(long n) {
		long sumOfSquares = 0;
		long squareOfSum = 0;
		
		for (int i = 1; i <= n; i++) {
			sumOfSquares += i*i;
		}
		
		for (int i = 1; i <= n; i++) {
			squareOfSum += i;
		}
		
		squareOfSum *= squareOfSum;
		
		return sumOfSquares - squareOfSum;
	}
}
