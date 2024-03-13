package Package_1;
//Assignment1-18th feb 2024-Inheritance with Constructor using Super and this keyword
//Child Class - Selenium1
public class Selenium1 extends Automation1 {
	public Selenium1() {
		super(222,222);
		System.out.println("Child class default constructor");
	}
	public Selenium1(int a) {
		this(55,99,44);
		
		System.out.println("Child class one parameterized constructor");
	}
	public Selenium1(int a,int b) {
		this();
		System.out.println("Child class two parameterized constructor");
	}
	public Selenium1(int a, int b,int c) {
		this(44,66);
		System.out.println("Child class three parameterized constructor");
	}

	public static void main(String[] args) {
		
    Selenium1 ob=new Selenium1(111);
	}

}
