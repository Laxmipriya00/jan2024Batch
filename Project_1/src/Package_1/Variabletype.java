package Package_1;

public class Variabletype {
	int deepak=10;   // global variable or instance variable
	public void m1() {
		int abc;   //local variable
		abc=20;
		deepak=deepak+1;
		System.out.println("Value of abc= "+abc);
		System.out.println("Value of deepak="+deepak);
	}
	public void m2() {
		//abc=abc+1; // cannot declare local variable of m1() inside m2() method.
		deepak=deepak+1;
		System.out.println("Value of deepak="+deepak);
	}

	public static void main(String[] args) {
		Variabletype obj=new Variabletype();
		obj.m1();
		obj.m2();
		
		

	}

}
