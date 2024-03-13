package Package_1;
//Hierarchical Inheritance(Son1 class)
public class Swift3 extends Maruti3{
public void method3() {
	System.out.println("Son1 class method 1");
}
public void method4() {
	System.out.println("Son1 class method 2");
}
public static void main(String[] args) {
	Swift3 s=new Swift3();
	s.method1();
	s.method2();
	s.method3();
	s.method4();
	s.abc=345;
	System.out.println("value of a is "+s.abc);
}
}
