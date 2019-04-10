package com.gillette.euler;

import static org.junit.Assert.*;

import org.junit.Test;

@SuppressWarnings("unused")
public class Problem1_Test {

	@Test
	public void testMultiplesOfThreeFive() {
		Euler euler = new Euler();
		try {
			System.out.println(euler.multiplesOfThreeFive(10));
			System.out.println(euler.multiplesOfThreeFive(50000));
			System.out.println(euler.multiplesOfThreeFive(123456));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
