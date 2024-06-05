package com.XMLCOfigApplContext ;
import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

//video 49
public class XMLConfigLauncherApplContext 
{
	public static void main(String[] args) {
		try (var context = new         
				ClassPathXmlApplicationContext("ContextConfig.XML ")){
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			
		}
	}		
	

}
