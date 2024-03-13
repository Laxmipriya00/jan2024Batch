package Package_1;

import java.util.Scanner;

//2nd march 2024--loop inside condition and condition inside loop
public class conditionwithLoop {

	public static void main(String[] args) {
		System.out.println("Please enter the value");
		Scanner sc=new Scanner(System.in);
	    int v=sc.nextInt();
	    //loop inside condition
	   /* if(v>0) {
	    	for(int i=0;i<=v;i=i+1) {
	    		System.out.println("value of i "+i);
	    	}
	    }*/
	    
	    //condition inside loop
	    for(int i=0;i<=v;i=i+1) {
	    	if(i%2==0) {
	    		System.out.println("value of i "+i);
	    	}
	    }
		

	}

}

