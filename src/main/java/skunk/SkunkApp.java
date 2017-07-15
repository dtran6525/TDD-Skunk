package main.java.skunk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SkunkApp {
	
	public static final int INITIAL_CHIPS = 100;
	
	public static void main(String[] args) {
		SkunkApp app = new SkunkApp();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many players?");
		int playerNum = sc.nextInt();
		List<Player> players = new ArrayList<>();
		for (int i = 0 ; i < playerNum ; i++) {
			int playerIndex = i + 1;
			System.out.print("Enter player " + playerIndex + "'s name:");
			players.add(new Player(sc.next(), INITIAL_CHIPS));
		}
	}
}
