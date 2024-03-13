package package_2;
//Object creation in another class within different package
import Package_1.Class_ABC;

public class Class_GHI {

	public static void main(String[] args) {
		Class_ABC obj=new Class_ABC();
		obj.method1();
		obj.method2();


	}

}
