package com.gameingApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component//Spring bean is to be created by automatically
@Primary//bean shoulhttps://www.youtube.com/watch?v=YJUrMMfATOAd be given
//preference  in case of multiple candidates  

public class Mariogame implements GamingConsole{
public void up() {
	System.out.println("jump");
}
	public void down() {
		System.out.println("go tot the hole");
		}
			public void left() {
			System.out.println("go back");
		}
			public void right() {
				System.out.println("accelerate");
}
}
