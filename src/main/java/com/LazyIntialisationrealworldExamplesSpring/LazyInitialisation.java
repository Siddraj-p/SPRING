package com.LazyIntialisationrealworldExamplesSpring;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository

class ClassA{
	ClassA(){
		System.out.println("intialisation done");	}
}
@Component//it automatically creatres the bean 
@Lazy//preventation of some  intialisation of a bean automatically  	  
class ClassB{   
	private ClassA classA;//using classA classB initialize itslef
	ClassB(ClassA classA){
		System.out.println("intialisaion of a instance ");
		this.classA=classA;
		}
	
}



@Component
@ComponentScan//we would add in this package name explicitly 
//which helps to search over spring in the component 
@Configuration
public class LazyInitialisation 
{
	public static void main(String[] args) {
		try (var Context= new AnnotationConfigApplicationContext(LazyInitialisation.class)) {
			
		 
		Arrays.stream(Context.getBeanDefinitionNames())
		.forEach(System.out::println);
		}
		
		 
		
		
}
}


