package Package_1;

import java.util.Scanner;

//25th feb 2024- condition handling using nested if else
//use of Scanner class
public class ConditionHandling_nestedifelse {

	public static void main(String[] args) {
		
		System.out.println("Please enter the value of a");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		/* 
		 //---------first way of nested if else-------------
		    if(a>0) {
			if(a%2==0) {
				System.out.println(a+"is even number");
			}
			else {
				System.out.println(a+"is an odd number");
			}
		}
		else {
			System.out.println("Please enter the correct number");
		}*/
		
		//----------------2nd way of nested if else--------------
		if(a<0) {
			System.out.println("Please enter the correct mark");
		}
		else {
			if(a%2==0) {
				System.out.println(a+"is even number");
			}
			else {
				System.out.println(a+"is an odd number");
			}
		}
	

	}

}

