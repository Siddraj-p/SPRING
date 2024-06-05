	package com.gameingApp;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component//used to make automatic bean
 
 @Qualifier("SuperContraGame")//in case of the multiple bean
	public class SuperContraGame implements GamingConsole {
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

