package test.java.skunk;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.skunk.Dice;
import main.java.skunk.Die;

public class TestDice {
	@Test
	public void testCreateDice() {
		int dieNum = 2;
		int maxValue = 4;
		Dice d = new Dice(dieNum, maxValue);
		assertTrue(d.getDieList().size() == dieNum);
		for (Die e : d.getDieList()) {
			assertTrue(e.getMaxValue() == maxValue);
		}
	}
	
	@Test
	public void testRollDice() {
		int dieNum = 2;
		int maxValue = 4;
		Dice d = new Dice(dieNum, maxValue);
		for (int i = 0; i < 1000; i++) {
			assertTrue(d.roll() <= (maxValue*dieNum));
		}
	}
}
