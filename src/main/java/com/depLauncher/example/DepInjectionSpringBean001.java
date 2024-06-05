package com.depLauncher.example ;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
class Vehicle{
	/*field injection in this @Autowired is on the field
	@Autowired
Car car;
	@Autowired
Bus bus;
	public String toString() {
		return car+" "+bus;
		
	}
	*/
	
	
	/* setter injection 
	Car car;
	@Autowired
	public Car getCar() {
		return car;
	}
	@Autowired

	public void setCar(Car car) {
		this.car = car;
	}
	Bus bus;	@Autowired
	public Bus getBus() {
		return bus;
	}
	@Autowired
	public void setBus(Bus bus) {
	System.out.println("constructor injection- Vehicle ");
		this.bus = bus;
	}
*/
	
	//constrctor injection
	Bus bus;
	Car car;
	
	public Vehicle (Bus bus ,Car car) {
	super();
	System.out.println("constructor injection ");
	
		this.car=car;
		this.bus=bus;
		
		
	
	}
	

@Component

class Car{
	
	
}
@Component

class Bus{

}

@Configuration 
@ComponentScan

public class DepInjectionSpringBean001 
{
	public static void main(String[] args) {
		try (var Context= new AnnotationConfigApplicationContext(DepInjectionSpringBean001.class)) {
			
		 
		Arrays.stream(Context.getBeanDefinitionNames())
		.forEach(System.out::println);
		}
		
		 
		
		
}
}
}



