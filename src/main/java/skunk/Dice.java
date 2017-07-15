package main.java.skunk;

import java.util.ArrayList;
import java.util.List;

public class Dice {
	
	private List<Die> dieList = new ArrayList<>(); 

	
	public Dice(int dieNum, int maxValue) {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < dieNum; i++) {
			dieList.add(new Die(maxValue));
		}
	}
	
	public List<Die> getDieList() {
		return dieList;
	}

	public void setDieList(List<Die> dieList) {
		this.dieList = dieList;
	}


}
