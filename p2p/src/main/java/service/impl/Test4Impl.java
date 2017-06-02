package service.impl;

import org.springframework.beans.factory.annotation.Autowired;

public class Test4Impl {
 
	@Autowired
	private Test2Impl test2;
	
	public void test(){
		test2.query();
	}
	
	
}
