package Package_1;
//Assignment2-18th feb 2024-Inheritance with Method using this keyword
//Child Class - Selenium2
public class Selenium2 extends Automation2{
	public void m5() {
		System.out.println("Child class default method");
	}
	public void m6(int a) {
		System.out.println("Child class one parameterized method");
	}
	public void m7(int a,int b) {
		super.m3(11,22);
		super.m1();
		super.m4(11,22,33);
		super.m2(11);
		
		
		System.out.println("Child class two parameterized method");
	}
	public void m8(int a,int b,int c) {
		this.m6(89);
		this.m5();
		System.out.println("Child class three parameterized method");
	}

	public static void main(String[] args) {
		Selenium2 s=new Selenium2();
		s.m7(11,12);
		s.m8(23, 44, 88);
		

	}

}
