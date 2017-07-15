package test.java.skunk;

import org.junit.Test;

import main.java.skunk.Die;

public class TestDie {
	@Test
	public void testCreateDie() {
		int maxValue = 6;
		Die d1 = new Die(maxValue);
		assert(d1.getMaxValue() == maxValue);
	}
	
}
