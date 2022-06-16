package com.cg.multi;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> linked = new LinkedHashSet<>();
		linked.add("Rahul");
		linked.add("pass");
		linked.add("Blood group");
		linked.add("O+");
		System.out.println(linked);
		Object[] a=linked.toArray();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}