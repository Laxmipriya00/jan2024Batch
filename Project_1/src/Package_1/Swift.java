package Package_1;
//Single Level Inheritance(Child Class)
public class Swift extends Maruti {
	public void method3() {
		System.out.println("Child class method");
	}
	public void method4() {
		System.out.println("Child class second method");
	}
	public static void main(String[] args) {
	Swift s=new Swift();//child class object
	s.method1();
	s.method2();
	s.method3();
	s.method4();
	s.abc=333;
	System.out.println("value of a "+s.abc);
	
	}
}