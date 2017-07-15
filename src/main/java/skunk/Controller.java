package main.java.skunk;

public class Controller {
	public Player createPlayer(String name, int initialChips) {
		return new Player(name, initialChips);
	}
}
