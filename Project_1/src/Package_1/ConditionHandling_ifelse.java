package Package_1;

import java.util.Scanner;

//25th feb 2024- condition handling using if else
//use of Scanner class
public class ConditionHandling_ifelse {

	public static void main(String[] args) {
		System.out.println("Please enter the value");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("a is even number");
		}
		else {
			System.out.println("a is an odd number");
		}

	}

}

