package de.htwg.monopoly.controller.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.htwg.monopoly.controller.impl.PlayerController;
import de.htwg.monopoly.entities.Player;

public class PlayerControllerTest {
	PlayerController players;
	
	@Before
	public void setUp() throws Exception {
		players = new PlayerController();
	}

	@Test
	public void testPlayerController() {
		PlayerController playersController = new PlayerController();
		Player player1 = playersController.getNextPlayer();
		player1.setName("Peter");
		assertEquals("Peter", player1.getName());
	}

	@Test
	public void testGetNextPlayer() {
		players = new PlayerController();
		Player player1 = players.getNextPlayer();
		player1.setName("Peter");
		assertEquals("Peter", player1.getName());
	}
	
	@Test
	public void testGetNextPlayerSecondBranch() {
		players = new PlayerController();
		Player player1 = players.getNextPlayer();
		player1.setName("Peter");
		player1 = players.getNextPlayer();
		player1.setName("J�rgen");
		player1 = players.getNextPlayer();
		assertEquals("Peter", player1.getName());
	}
	
	@Test
	public void testCurrentPlayer() {
		players = new PlayerController();
		Player player1 = players.getNextPlayer();
		player1.setName("Peter");
		assertEquals("Peter", players.currentPlayer().getName());
	}
	


}
