package AccessModifiersDemo;

public class Test1 {
	protected int i=10;
	protected void show() {
		System.out.println("hello world");
	}

	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.show();
		System.out.println(t1.i);

	}

}