package main.java.skunk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

	public int roll() {
		int result = dieList.stream().collect(Collectors.summingInt(Die::roll));
		return result;
	}


}
