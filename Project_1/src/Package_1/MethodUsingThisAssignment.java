package Package_1;

public class MethodUsingThisAssignment {
	public void method() {
		this.method(10,20,30,40);
		System.out.println("Default Method...");
	}
	public void method(int a) {
		this.method();
		System.out.println("One Parameterized Method...");
	}
	public void method(int a, int b) {
		this.method(10);
		System.out.println("Two Parameterized Method...");
	}
	public void method(int a, int b, int c) {
		System.out.println("Three Parameterized Method...");
	}
	public void method(int a, int b, int c, int d) {
		this.method(10,20,30);
		System.out.println("Four Parameterized Method...");
	}
	public static void main(String[] args) {
		MethodUsingThisAssignment obj=new MethodUsingThisAssignment();
		obj.method(10,20);

	}

}
