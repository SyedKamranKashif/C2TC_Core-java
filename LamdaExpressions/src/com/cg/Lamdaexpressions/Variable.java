package com.cg.Lamdaexpressions;
interface Drawable{
	public void draw (int radius);
}

public class Variable {

	public Variable() {
		
	}

	public static void main(String[] args) {
		Drawable d2 =(int radius)->{
		System.out.println("draw a circle with radius of"+ radius);
	};
	d2.draw(10);
		

	}

}
