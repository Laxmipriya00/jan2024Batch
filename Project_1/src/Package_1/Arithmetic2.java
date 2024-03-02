package Package_1;
//((((10+2)+2)-2)*2)/2)
public class Arithmetic2 {
	
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
	
	public int multi(int x7,int x8) {
		int x9;
		x9=x7*x8;
		System.out.println("multi result is "+x9);
		return x9;
	}
	
	public void div(int x10,int x11) {
		int finalresult;
		finalresult=x10/x11;
		System.out.println("final result is "+finalresult);
	}
	
	public static void main(String[] args) {
		Arithmetic2 ob=new Arithmetic2();
		int sumresult1=ob.sum(10,2);
		int sumresult2=ob.sum(sumresult1, 2);
		int subresult=ob.sub(sumresult2, 2);
		int multiresult=ob.multi(subresult, 2);
		ob.div(multiresult, 2);
	}

}
