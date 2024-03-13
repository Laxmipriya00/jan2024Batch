package Package_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/*3rd march-1)how to read the data from txt file character by character?
2)how to read the data from txt file line by line 
3)how to write a single line
4)how to read multiple lines 
5)how to append the data in existing file    */

public class DataRead {
	
	/*public void readDataFile() throws IOException {
		File f=new File("../Project_1/data.txt");//connection establish
		FileReader fr=new FileReader(f); //FileReader object
		int a;
		while((a=fr.read())!=-1)
		{
			System.out.println((char)a);
		}
		
	}*/
	
	 public void readDataLineByLine() throws IOException {
		File f=new File("../Project_1/data.txt");//connection establish
		FileReader fr=new FileReader(f); //FileReader object
		BufferedReader b=new BufferedReader(fr); // class used to read the data line by line
		String s;
		while((s=b.readLine())!=null)
		{
			System.out.println(s);
		}
		
		
	}
	
	public void WriteData() throws IOException {
		File f=new File("../Project_1/data.txt");//connection establish
		FileWriter fw=new FileWriter(f);//FileWriter object
		BufferedWriter b=new BufferedWriter(fw);//class which give newLine() method
		b.write("Welcome guys");
		b.newLine();//it will move cursor to the next line
		b.write("SDET is the best one");// writing the data
		b.close();//for saving and closing the file
	}
	
	public void AppendData() throws IOException {
		
		File f=new File("../Project_1/data.txt");//connection establish
		FileWriter fw=new FileWriter(f, true);
		BufferedWriter b=new BufferedWriter(fw);
		b.newLine();
		b.write("third line of the code");
		b.newLine();
		b.write("fourth line of the code");
		b.close();
		
		
	}
	
	public static void main(String[] args) throws IOException
	{
		DataRead d=new DataRead();
		//d.readDataFile();
		d.readDataLineByLine();
		d.WriteData();
		d.AppendData();
	}

}
