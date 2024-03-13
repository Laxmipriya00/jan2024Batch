package Package_1;
//2nd march 2024--Double loop Assignment 4
//floyd triangle
public class Doubleloop_Assignment4{

	public static void main(String[] args) {
	/*	int count=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}*/
		int count=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			for(int k=3;k>=i;k--) {
				System.out.print(" ");
				
			}
			System.out.println();
		}
		
		

	}

}

