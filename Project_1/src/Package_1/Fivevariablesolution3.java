package Package_1;
//Five variable... We have to give the values to those variables and we have to print it.
//Solution2-With the help of constructor
//1 object=5=5 calls
//10 objects=50 calls
//No. of calls has been reduced
public class Fivevariablesolution3 {
	int a,b,c,d,e;
	public Fivevariablesolution3(int x1,int x2,int x3,int x4,int x5) {
		a=x1;
		b=x2;
		c=x3;
		d=x4;
		e=x5;
	}

	public static void main(String[] args) {
		Fivevariablesolution3 ob=new Fivevariablesolution3(10,20,30,40,50);
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
		System.out.println(ob.e);
		

	}

}
