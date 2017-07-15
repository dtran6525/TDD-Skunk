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
	
	@Test
	public void testRollDie() {
		int maxValue = 2;
		Die d1 = new Die(maxValue);
		for (int i = 0; i < 1000; i++) {
			assert(d1.roll() <= 2);
		}
	}
	
}
