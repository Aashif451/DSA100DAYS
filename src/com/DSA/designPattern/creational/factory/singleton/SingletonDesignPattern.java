package com.DSA.designPattern.creational.factory.singleton;

import java.io.Serializable;

public class SingletonDesignPattern implements Cloneable,Serializable{
	
	private static volatile SingletonDesignPattern instance;
	
	private  SingletonDesignPattern() {
		if (instance!=null) {
		throw new RuntimeException("this is instantiation not allowed ");
		}
		
	}
	
	public static SingletonDesignPattern getInstance() {
		if (instance==null) {
			
			synchronized (SingletonDesignPattern.class) {
				if (instance==null) {
					instance = new SingletonDesignPattern ();
				}
				
			}
		}
		
		
		
		
		return instance;
		
		
		
		
	}
	
	
    protected Object readResolve() {
        return getInstance();
    }
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	    throw new CloneNotSupportedException("clone not Allowed");
	}
	
	

}
