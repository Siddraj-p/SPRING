 package com.gameingApp;

import org.springframework.stereotype.Component;

@Component
public class PasoGame implements GamingConsole {
	
public void up() {
	System.out.println("go tot the hole");
}
	public void down() {
		System.out.println("jump");
		}
			public void left() {
			System.out.println("accelerate");
		}
			public void right() {
				System.out.println("go back");
}
}


