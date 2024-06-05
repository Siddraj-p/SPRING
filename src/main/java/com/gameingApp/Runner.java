package com.gameingApp;

import org.springframework.stereotype.Component;
@Component
public class Runner {
	GamingConsole game;
	public Runner (GamingConsole game){
	this.game=game;
	 } 
	public void run() {
		System.out.println("running game:"+game);	
		game.up();
		game.left();
		game.right();
		game.down();
		
		
	}
	}
