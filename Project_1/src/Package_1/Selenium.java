package Package_1;
//Inheritance with Constructor - Child Class-Super keywords
public class Selenium extends Automation{
	public Selenium() {
		System.out.println("Child class default constructor");
	}
	public Selenium(int a) {
		super(555,666);
	   System.out.println("Child class one parameterized constructor");
	}
	public Selenium(int a,int b) {
		super(555);//It will call parent one parameterized constructor
		System.out.println("Child class two parameterized constructor");
	}
	public Selenium(int a,int b, int c) {
		System.out.println("Child class three parameterized constructor");
	}

	public static void main(String[] args) {
		Selenium ob=new Selenium();
		Selenium ob1=new Selenium(122);
		Selenium ob2=new Selenium(122,444);
		Selenium ob3=new Selenium(122,444,555);

	}

}
