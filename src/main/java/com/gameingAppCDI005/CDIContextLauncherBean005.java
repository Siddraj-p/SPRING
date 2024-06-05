package com.gameingAppCDI005;
import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;
@Named//instead of the Component we can use named

//@Component 
class BUsinessService{
	private DataService dataService;

	//@Autowired
	@Inject
	public void setData(DataService dataService) {
				this.dataService = dataService;
	}
	
	public DataService getData() {
	System.out.println("settter injection ");
		return dataService;
	}
	
	
}
@Component
@Named
class DataService{
	//video 48 take once revision
}

@Configuration
@ComponentScan
public class CDIContextLauncherBean005 	
{
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(CDIContextLauncherBean005.class)) {
		Arrays.stream(context.getBeanDefinitionNames())
		.forEach(System.out::println);
	//
		//System.out.println(context.getBean(BUsinessService.class).getDataService);
		}
		
		
	}	

}
