package Package_1;

public class Student {
	int rollNo;
	int age;
	public void display1() {
		System.out.println("Welcome to all of you");
	}
	public void display2() {
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		Student ob=new Student();
		ob.display1();
		ob.display2();
		ob.rollNo=20;
		System.out.println("Roll no. of the Student = "+ob.rollNo);
		ob.age=23;
		System.out.println("Age of the Student = "+ob.age);
	}

}
