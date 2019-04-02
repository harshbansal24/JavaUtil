package com.harsh.util.helper;

public enum ActionEnum {
	   ABC {
	      @Override
	      void doSomething() {
	          System.out.println("Doing something for ABC");    
	      }

	   },
	   XYZ {
	      @Override
	      void doSomething() {
	         System.out.println("Doing something for XYZ"); 
	      }
	   };

	   abstract void doSomething();
	}
