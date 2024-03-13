package Package_1;
//Inheritance with Constructor - PARENT CLASS-this keyword
public class Automation {
public Automation() {
	System.out.println("Parent default constructor");
}
public Automation(int a) {
	System.out.println("Parent One parameterized constructor");
}
public Automation(int a,int b) {
	this(666);
	System.out.println("Parent two parameterized constructor");
}
}
