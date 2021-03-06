package dev.darkheerser.tilegame;

import dev.darkheerser.tilegame.gfx.Camera;
import dev.darkheerser.tilegame.input.KeyManager;
import dev.darkheerser.tilegame.input.MouseManager;
import dev.darkheerser.tilegame.worlds.World;

public class Handler {

	private Game game;
	private World world;
	
	public Handler(Game game) {
		this.game = game;
		
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
	
	public MouseManager getMouseManager() {
		return game.getMouseManager();
	}
	
	public int getWidth() {
		return game.getWidth();
	}
	
	public int getHeight() {
		return game.getHeight();
	}
	
	public Camera getCamera() {
		return game.getCamera();
	}
	
	public KeyManager getKeyManager() {
		return game.getKeyManager();
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}
	
}
