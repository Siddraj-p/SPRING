package com.realworldExamplesSpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component //Instead of Component we use the @Repositary Bzc of it ois data retrive and manipulation

@Component 
@Primary
public class MangoDbservice implements Dataservice {

	@Override
	public int[] retrive() {
		// TODO Auto-generated method stub
		return new int[] {12,43,543,54,};
	}



}
