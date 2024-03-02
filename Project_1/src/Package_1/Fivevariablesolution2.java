package Package_1;
//Five variable... We have to give the values to those variables and we have to print it.
//Solution2-With the help of method
//1 object=1+5=6 calls
//10 objects=60 calls

public class Fivevariablesolution2 {
	
	int a,b,c,d,e;
	public void method1(int x1,int x2,int x3,int x4,int x5) {
		a=x1;
		b=x2;
		c=x3;
		d=x4;
		e=x5;
	}

	public static void main(String[] args) {
		
		Fivevariablesolution2 ob=new Fivevariablesolution2();
		ob.method1(10,20,30,40,50);
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
		System.out.println(ob.e);
	

	}

}
