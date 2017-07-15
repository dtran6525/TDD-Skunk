package main.java.skunk;

public class Player {
	private String name;
	private int chips;
	
	public Player(String name, int chips) {
		super();
		this.name = name;
		this.chips = chips;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChips() {
		return chips;
	}
	public void setChips(int chips) {
		this.chips = chips;
	}
	
}
