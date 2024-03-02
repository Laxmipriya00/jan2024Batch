package Package_1;

public class StudentConst {
	
	public StudentConst()
	{
		System.out.println("Default Constructor...");
	}
    
	public StudentConst(int a)
	{
		System.out.println("One parameterized constructor...");
	}
	
	public StudentConst(int a, int b) {
		System.out.println("Two parameterized constructor...");
	}
	public static void main(String[] args) {
		
		//StudentConst obj1=new StudentConst();
		//StudentConst obj2=new StudentConst(444);
		//StudentConst obj3=new StudentConst(444,43);
		
		StudentConst obj3=new StudentConst(444,43);
		StudentConst obj1=new StudentConst();
		StudentConst obj2=new StudentConst(444);
		
		
		
		

	}

}
