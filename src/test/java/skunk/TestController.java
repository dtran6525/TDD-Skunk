package test.java.skunk;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.skunk.Controller;
import main.java.skunk.Player;

public class TestController {
	@Test
	public void testCreatePlayer() {
		Controller c = new Controller();
		String name = "xyz";
		int initialChips = 100;
		Player p = c.createPlayer(name, initialChips);
		assertTrue(p.getName().equals(name));
		assertTrue(p.getChips() == initialChips);
	}
}
