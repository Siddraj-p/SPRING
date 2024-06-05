package com.realworldExamplesSpring;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import ch.qos.logback.core.net.SyslogOutputStream;
@Configurable 
@ComponentScan//we would add in this package name explicitly 
//which helps to search over spring in the component 
public class DepInjectionSpringBean004 
{
	public static void main(String[] args) {
		try (var Context= 
				new AnnotationConfigApplicationContext
				(DepInjectionSpringBean004.class)) {
			//System.out.println(Context.getBean("MagnoDb"));
		 System.out.println("MangoDbservice");
	//	Arrays.stream(Context.getBeanDefinitionNames())
		//.forEach(System.out::println);
		}
}
}


