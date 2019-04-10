package com.gillette.euler;

import static org.junit.Assert.*;

import org.junit.Test;

@SuppressWarnings("unused")
public class Problem2_Test {

	@Test
	public void testEvenFibonacci() {
		Euler euler = new Euler();
		
		try {
			System.out.println(euler.evenFibonacci(1));
			System.out.println(euler.evenFibonacci(2));
			System.out.println(euler.evenFibonacci(3));
			System.out.println(euler.evenFibonacci(5));
			System.out.println(euler.evenFibonacci(100));
			System.out.println(euler.evenFibonacci(100000));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
