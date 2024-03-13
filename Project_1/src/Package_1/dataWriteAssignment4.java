package Package_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*9th march 2024- Assignment-4- Create a method named WriteDataInaRange and pass the initialrowCount,endrowCount 
 and that method will write in that range and you have to take the data from user,that should be write in the file(2,7) 
 while calling the method should write from 2nd to 7th line and first line will be blank */

//write the data in a range (for example 4,7 we are passing so initial 3 rows blank and data should be written from 4th row to till 7th row
 
public class dataWriteAssignment4 {
	
	public void writeDataInaRange(int initialrowNo, int endrowNo) throws IOException {//2nd to 4th row
		File f= new File("../Project_1/data.txt"); //File object
		FileWriter fw=new FileWriter(f); //FileWriter Object
		BufferedWriter b=new BufferedWriter(fw); //BufferedWriter Object
		Scanner sc=new Scanner(System.in); //Scanner object
		String data=null;
		System.out.println("Please enter the data");
		for(int i=1;i<=endrowNo;i=i+1) {
			if((i>=initialrowNo)&&(i<=endrowNo))
			{
			data=sc.nextLine(); // next()-for string type of data or,sc.nextLine()
			b.write(data);
			b.newLine();
		}
		else
		{
			b.newLine();
		}
			
		}
			
		b.close();
	}

	public static void main(String[] args) throws IOException {
		dataWriteAssignment4 d=new dataWriteAssignment4();
		d.writeDataInaRange(4,7);
	}

}


