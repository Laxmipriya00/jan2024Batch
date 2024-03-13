package Package_1;

public class second extends first{
	public void m3() {
		super.m1();
		super.m2();
		super.laxmipriya=333;
		System.out.println(super.laxmipriya);
		System.out.println("Child class method 1");
	}
	public void m4() {
	    super.m1();
	    super.m2();
		System.out.println("Child class method 2");
	}

	public static void main(String[] args) {
		second s=new second();
		s.m3();
		s.m4();
		//s.laxmipriya=333;
		//System.out.println(s.laxmipriya);
		

	}

}
