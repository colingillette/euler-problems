package com.gillette.euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem3_Test {

	@Test
	public void test() {
		Euler euler = new Euler();
		
		try {
			System.out.println(euler.smallestMultiple());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
