package com.realworldExamplesSpring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class Oracle implements Dataservice  {

	@Override
	public int[] retrive() {
		// TODO Auto-generated method stub
		System.out.println("hey biddy");
		return new int[] {12,23,23,43,2123};
	}

}
