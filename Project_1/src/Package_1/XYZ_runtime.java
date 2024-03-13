package Package_1;
//24th feb 2024-Run time polymorphism/Dynamic Polymorphism/Method Overriding
//child class
public class XYZ_runtime extends ABC_runtime {
	public void arithmetic(int a1,int a2) {
		int r;
		r=a1-a2;
		System.out.println("Result is "+r);
	}

	public static void main(String[] args) {
		XYZ_runtime ob=new XYZ_runtime();
		ob.arithmetic(23,23);

	}

}
