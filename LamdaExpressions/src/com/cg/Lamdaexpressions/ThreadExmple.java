package com.cg.Lamdaexpressions;

interface Lamda2{
	public void display();
} 

public class ThreadExmple {

	public static void main(String[] args) {
		new Thread(()->{System.out.println("this is one thread");}).start();
		
	}
}