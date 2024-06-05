package com.PrePostAnnotations.example ;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
class 	SomeDependency{
@PostConstruct
//The PostConstruct annotation is used on a method thatneeds to be executed after
//dependency injection is done to performany initialization
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("hey ram");
	}
	}



@Component
class Someclass {
	private static SomeDependency dep;
		Someclass(SomeDependency dep){
		this.dep=dep;
		System.out.println("all dependencus injected  ");
	}
		
		//maiking the method as a PostConstruct and calling the get method
	@PostConstruct
				public  void getintialisation() {
		dep.get();
					}
	@PreDestroy
	public void get1() {
		// TODO Auto-generated method stub
		System.out.println("finished");
	}

	}


	
@ComponentScan
public class PrePostAnnotations 
{
	public static void main(String[] args) {
		try (var Context= new AnnotationConfigApplicationContext
				(PrePostAnnotations.class)) {
			Arrays.stream(Context.getBeanDefinitionNames())		
			.forEach(System.out::println);
				}	
	}
}

//@postCostruct//pring calls the methods annotated with @PostConstruct only once, 
//just after the initialization of bean properties.

//@preDestroy
//method annotated with @PreDestroy runs only once,
//just before Spring removes our bean from the application context.