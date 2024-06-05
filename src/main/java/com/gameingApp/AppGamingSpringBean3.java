package com.gameingApp ;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan("game")
public class AppGamingSpringBean3 
{
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(AppGamingSpringBean3.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(Runner.class).run();			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}	

}
