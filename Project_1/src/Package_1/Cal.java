package Package_1;
//24th feb 2024-Compile time polymorphism/Method overloading/static polymorphism
public class Cal {
public void sum(int a, int b) {
	int c;
	c=a+b;
	System.out.println("result is "+c);
}
public int sum(int x,int y,int z) {
	int result;
	result=x+y+z;
	System.out.println("result is "+result);
	return result;
}
	public static void main(String[] args) {
	Cal ob=new Cal();
	ob.sum(12,12);	
	int sumResult=ob.sum(12,12,12);

	}

}
