package Package_1;
//Multilevel Inheritance(Child Class)
public class SwiftDezire extends Swift1 {
    public void method5() {
    	System.out.println("Child class method");
    }
	public static void main(String[] args) {
		SwiftDezire s=new SwiftDezire();
		s.method1();
		s.method2();
		s.method3();
		s.method4();
		s.method5();
		s.abc=333;
		System.out.println("value of a"+s.abc);

	}

}
