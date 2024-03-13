package Package_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//9th march 2024- Assignment-5-Read from file1 and Write that data into file2(Copy--paste)
 
public class dataReadWriteCopyAssignment5 {
	
	public void writeDataInaRange( ) throws IOException {//2nd to 4th row
		File f1= new File("../Project_1/data.txt"); //Read File object and Read File Path
		File f2=new File("../Project_1/datacopy.txt"); //Write File object and Write File Path
		FileReader fr=new FileReader(f1); //FileReader Object
		FileWriter fw=new FileWriter(f2); //FileWriter Object
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw); //BufferedWriter Object
		String readData=null;
		System.out.println("Please enter the data");
		while((readData=br.readLine())!=null)
			{
			bw.write(readData);
			bw.newLine();
			}
		bw.close();
		br.close();
	}

	public static void main(String[] args) throws IOException {
		dataReadWriteCopyAssignment5 d=new dataReadWriteCopyAssignment5();
		d.writeDataInaRange();
	}

}



