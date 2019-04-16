package com.gillette.euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem6_Test {

	@Test
	public void test() {
		try {
			Euler euler = new Euler();
			System.out.println(euler.sumSquareDifference(10));
			System.out.println(euler.sumSquareDifference(50));
			System.out.println(euler.sumSquareDifference(100));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
