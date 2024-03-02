package Package_1;
//((((10/2)-2)+2)-2)/2)
public class Arithmetic3 {
	
	public int sum(int x1, int x2) {
		int x3;
		x3=x1+x2;
		System.out.println("sum result is "+x3);
		return x3;
	}
	
	public int sub(int x4, int x5) {
		int x6;
		x6=x4-x5;
		System.out.println("sub result is "+x6);
		return x6;
		
	}
	
	public int div(int x7,int x8) {
		int x9;
		x9=x7/x8;
		System.out.println("div result is "+x9);
		return x9;
	}
	
	public static void main(String[] args) {
		Arithmetic3 ob=new Arithmetic3();
		int divresult=ob.div(10,2);
		int subresult1=ob.sub(divresult, 2);
		int sumresult=ob.sum(subresult1, 2);
		int subresult2=ob.sub(sumresult, 2);
		int finalresult=ob.div(subresult2, 2);
		System.out.println("final result is "+finalresult);
	}

}
