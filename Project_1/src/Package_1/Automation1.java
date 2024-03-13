package Package_1;
//Assignment1-18th feb 2024-Inheritance with Constructor using Super and this keyword
//Parent Class - Automation1
public class Automation1 {
public Automation1() {
	this(112,333,222);
	System.out.println("Parent class default constructor");
}
public Automation1(int a) {
	this();
	System.out.println("Parent class one parameterized constructor");
}
public Automation1(int a,int b) {
	this(122);
	System.out.println("Parent class two parameterized constructor");
}
public Automation1(int a,int b,int c) {
	System.out.println("Parent class three parameterized constructor");
}
}
