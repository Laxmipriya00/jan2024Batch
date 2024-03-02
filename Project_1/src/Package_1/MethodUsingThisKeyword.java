package Package_1;

public class MethodUsingThisKeyword {
	
	public void method1() {
		this.method2();
		System.out.println("First method...");
		this.method2();
	}
	public void method2() {
		System.out.println("Second method...");
	}

	public static void main(String[] args) {
		MethodUsingThisKeyword ob=new MethodUsingThisKeyword();
		ob.method1();

	}

}
