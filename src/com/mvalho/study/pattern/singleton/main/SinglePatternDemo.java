package com.mvalho.study.pattern.singleton.main;

import com.mvalho.study.pattern.singleton.model.SingleObject;

public class SinglePatternDemo {

	public static void main(String[] args) {
		SingleObject singleObject =  SingleObject.getInstance();
		
		singleObject.showMessage();
	}

}
