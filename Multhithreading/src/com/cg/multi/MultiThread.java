package com.cg.multi;

class Eclipse extends Thread {
 public void run() {
	 for(int i=0;i<5;i++) {
	 System.out.println("eclipse thread id is" +Thread.currentThread().getId());
 }
}
}
class PPT extends Thread{
	public void run() {
		 for(int i=0;i<5;i++) {

		System.out.println("PPT thread id is" +Thread.currentThread().getId());
	 }
	}
}
 class NotePad extends Thread{
	 public void run() {
		 for(int i=0;i<5;i++) {

			System.out.println("notepad thread id is" +Thread.currentThread().getId());
		 }
 }
 }

public class MultiThread {

	public static void main(String[] args) {
		Eclipse obj1 =new Eclipse();
		obj1.start();
		PPT obj2 = new PPT();
		obj2.start();
		NotePad obj3 =new NotePad();
		obj3.start();
		System.out.println("main thread id is" +Thread.currentThread().getId());
	}
}