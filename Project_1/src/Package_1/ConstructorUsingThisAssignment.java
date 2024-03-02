package Package_1;

public class ConstructorUsingThisAssignment {
	public ConstructorUsingThisAssignment() {
		this(10,20,30);
		System.out.println("Default Constructor...");
	}
	public ConstructorUsingThisAssignment(int a) {
		this();
		System.out.println("One parameterized Constructor...");
	}
	public ConstructorUsingThisAssignment(int a, int b) {
		this(10);
		System.out.println("Two parameterized Constructor...");
	}
    public ConstructorUsingThisAssignment(int a, int b, int c) {
		System.out.println("Three parameterized Constructor...");
	}
	public ConstructorUsingThisAssignment(int a, int b, int c, int d) {
		this(10,20);
		System.out.println("Four parameterized Constructor...");
	}
	public static void main(String[] args) {
		ConstructorUsingThisAssignment obj=new ConstructorUsingThisAssignment(10,20,30,40);

	}

}
