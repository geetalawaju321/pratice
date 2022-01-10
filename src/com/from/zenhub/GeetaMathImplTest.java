package com.from.zenhub;

import org.junit.Assert;
import org.junit.Test;

public class GeetaMathImplTest {
	@Test
	public void testAdd(){
		GeetaMath geetaMath = new GeetaMathImpl();
		Assert.assertTrue(5 == geetaMath.add(2, 3));
		Assert.assertTrue(0 == geetaMath.add(0, 0));
		Assert.assertTrue(-1 == geetaMath.add(1, -2));
		Assert.assertTrue(-2 == geetaMath.add(-1, -1));
	}
	
	@Test
	public void testSubtract(){
		GeetaMath geetaMath = new GeetaMathImpl();
		Assert.assertTrue(4 == geetaMath.subtract(6, 2));
		Assert.assertTrue(geetaMath.subtract(5, 6) == -1);
		Assert.assertTrue(geetaMath.subtract(-2, 3) == -5);
		Assert.assertTrue(geetaMath.subtract(-4, -4) == 0);
	}
}