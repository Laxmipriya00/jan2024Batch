package Package_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*9th march 2024- Assignment-3- Create a method named WriteData and pass the row count and that method will
 write till that rowCount and you have to take the data from user, that should be write in the file. */
 
public class dataWriteAssignment3 {
	
	public void writeData(int rowNo) throws IOException {//2nd to 4th row
		File f= new File("../Project_1/data.txt"); //File object
		FileWriter fw=new FileWriter(f); //FileWriter Object
		BufferedWriter b=new BufferedWriter(fw); //BufferedWriter Object
		Scanner sc=new Scanner(System.in); //Scanner object
		String data=null;
		System.out.println("Please enter the data");
		for(int i=0;i<rowNo;i=i+1) {
			data=sc.nextLine(); // next()-for string type of data or,sc.nextLine()
			b.write(data);
			b.newLine();
		}
		b.close();
	}

	public static void main(String[] args) throws IOException {
		dataWriteAssignment3 d=new dataWriteAssignment3();
		d.writeData(3); //if I am passing 3, then it should write till 3rd row and the data we have to take from the user using Scanner class
	}

}

