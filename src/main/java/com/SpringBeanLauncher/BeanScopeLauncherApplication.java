package com.SpringBeanLauncher;
import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
class NormalClass {
//it is the  singleton bean	
}


@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)//we can add this on any Component
 class PrototypeClass{
//prototype bean in this case a new instance is created each tym whenever the 
	//request comes for particular bean 	


@Component
@ComponentScan//we would add in this package name explicitly 
//which helps to search over spring in the component 
@Configuration 
public class BeanScopeLauncherApplication 
{
	public static void main(String[] args) {
		try (var Context= 
				new AnnotationConfigApplicationContext
				(BeanScopeLauncherApplication.class)) {
			
			//same in stance is created in each tym
			//any modification done on  later on its bean reflects on all instances  
			System.out.println(Context.getBean(NormalClass.class ));//com.SpringBeanLauncher.NormalClass@609e8838
			System.out.println(	Context.getBean(NormalClass.class ));//com.SpringBeanLauncher.NormalClass@609e8838
			System.out.println(Context.getBean(NormalClass.class ));//com.SpringBeanLauncher.NormalClass@609e8838

//diffrent instance 
			System.out.println(Context.getBean(PrototypeClass.class )); //com.SpringBeanLauncher.PrototypeClass@359df09a
			System.out.println(Context.getBean(PrototypeClass.class)); //com.SpringBeanLauncher.PrototypeClass@43df23d3
			System.out.println(Context.getBean(PrototypeClass.class )); //com.SpringBeanLauncher.PrototypeClass@6d60fe40

		


		}
		
		
}
}

}


