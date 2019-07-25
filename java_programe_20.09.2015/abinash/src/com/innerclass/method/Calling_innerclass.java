package com.innerclass.method;

import com.innerclass.method.Inner_class.inner;

public class Calling_innerclass {
	
	public static void main(String[] args) {
		
		
	    Inner_class ref=new Inner_class();
	    
	    Inner_class.inner ref1=ref.new inner();
	    
	    ref1.main();
		
		
	}

}
