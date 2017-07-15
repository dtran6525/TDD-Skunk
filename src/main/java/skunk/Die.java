package main.java.skunk;

import java.util.Random;

public class Die {
	
	private int maxValue;
	
	public Die(int maxValue) {
		this.maxValue = maxValue;
	}
	
	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public int roll() {
		Random r = new Random();
		return r.nextInt(maxValue+1);
	}

}	
