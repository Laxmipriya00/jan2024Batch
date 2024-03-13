package Package_1;
//Hierarchical Inheritance(Son2 class)
public class Baleno3 extends Maruti3{
public void method5() {
	System.out.println("Son2 class method 1");
}
public void method6() {
	System.out.println("Son1 class method 2");
}
public static void main(String[] args) {
	Baleno3 b=new Baleno3();
	b.method1();
	b.method2();
	b.method5();
	b.method6();
	b.abc=345;
	System.out.println("value of a is "+b.abc);
}
}