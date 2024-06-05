package com.realworldExamplesSpring;

import java.util.Arrays;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component instead it we can use the @Service bcz it class giving a service 
@Component 
@Repository
public class BussinessAnlaysis {
	public  Dataservice dataservice;
public 	BussinessAnlaysis(Dataservice dataservice){
		this.dataservice=dataservice;
		
	}
public IntStream findMax() {
	return Arrays.stream(dataservice.retrive());
	
}
}
