package Package_1;

import java.util.Scanner;

//25th feb 2024- loops-for loop,while loop, do while loop 
//use of Scanner class
public class loops {

	public static void main(String[] args) {
		
		//for loop
		System.out.println("for loop.......");
		for(int i=0;i<10;i=i+1) 
		{
			System.out.println("value of i "+i);
		}
		
		//while loop
		System.out.println("while loop.....");
	
		/* int i=0;
		while(i<=10)
		{
			System.out.println("value of i "+i);
			i=i+1;
		} */
		
		//do while loop
		System.out.println("do while loop.....");
		int i=0;
		do
		{
			System.out.println("value of i "+i);
			i=i+1;
		}while(i>=10); 
		

	}

}

