package Package_1;

import java.util.Scanner;

//25th feb 2024- condition handling using else if ladder 
//use of Scanner class
public class ConditionHandling_elseifladder {

	public static void main(String[] args) {
		System.out.println("Please enter the marks");
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if((marks>=0)&&(marks<35)) {
			System.out.println("Failed...."+marks);
		}
		else if((marks>=35)&&(marks<60))
		{
		    System.out.println("Pass...."+marks);	
		}
		else if((marks>=60)&&(marks<80))
		{
			System.out.println("first division...."+marks);
		}
		else if ((marks>=80)&&(marks<100))
        {
	        System.out.println("Merit...."+marks);
        }
		else
		{
			System.out.println("Please enter the correct marks...");
		}
		
	}
	
	
}	