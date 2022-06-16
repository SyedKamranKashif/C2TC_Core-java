package com.cg.multi;

import java.util.LinkedList;
import java.util.List;

public class LinkedListHeterogenousDemo {
	public static void main(String[] args) {
		List list =new LinkedList();
		list.add("anu");
		list.add(6);
		list.add("jay");
		list.add(56.f);
		list.add(null);
		list.add(6);
		System.out.println(((LinkedList)list).offer("sanju"));
		System.out.println(list);
	}

}
