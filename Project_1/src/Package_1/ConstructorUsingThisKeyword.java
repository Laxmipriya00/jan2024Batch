package Package_1;



public class ConstructorUsingThisKeyword {
	
	public ConstructorUsingThisKeyword() {
		this(30);
		System.out.println("Default Constructor");
	}
	public ConstructorUsingThisKeyword(int a) {
		System.out.println("One parameterized Constructor");
	}
	public ConstructorUsingThisKeyword(int a, int b) {
		this();
		System.out.println("Two parameterized Constructor");
	}

	public static void main(String[] args) {
		ConstructorUsingThisKeyword ob1=new ConstructorUsingThisKeyword(40,50);
		ConstructorUsingThisKeyword ob2=new ConstructorUsingThisKeyword();
		ConstructorUsingThisKeyword ob3=new ConstructorUsingThisKeyword(50);
		
		
		

	}

}
