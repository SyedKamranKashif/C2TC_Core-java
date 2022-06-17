package com.cg.enums;

public class Main {
   public enum Season{
	   WINTER,SPRING,SUMMER,AUTUMN
   }
	public static void main(String[] args) {
		for (Season s: Season.values()) {
			System.out.println(s);
		}
		System.out.println("the value of autumn is:" +Season.valueOf("AUTUMN")); 
		System.out.println("the index of winter is:" +Season.valueOf("WINTER").ordinal());
		System.out.println("the index of winter is:" +Season.valueOf("SUMMER").ordinal());
	}

}