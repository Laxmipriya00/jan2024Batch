package Package_1;

import java.util.Scanner;

//25th feb 2024- condition handling using Switch case
//use of Scanner class
public class ConditionHandling_Switch {

	public static void main(String[] args) {
		System.out.println("Please enter the value of a and b");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Please enter the operator");
		int operator=sc.nextInt();
		int result;
		switch(operator){
			case 1:
				result=a+b;
				System.out.println("Result is"+result);
				break;
			case 2 :
				result=a-b;
				System.out.println("Result is"+result);
				break;
			case 3 :
				result=a*b;
				System.out.println("Result is"+result);
				break;
			case 4 :
				result=a/b;
				System.out.println("Result is"+result);
				break;
			default :
				System.out.println("Please enter the correct operator");
				break;
				
		}

	}

}
