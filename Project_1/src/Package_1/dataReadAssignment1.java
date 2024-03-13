package Package_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*9th march 2024- Assignment-1- Create a method named ReadData and pass the row No and that method
 will read the data of that particular row. */
 
public class dataReadAssignment1 {
	
	public void readParticularData(int rowNo) throws IOException {
		File f= new File("../Project_1/data.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		int flag=0;
		String data;
		while((data=b.readLine())!=null) {
			flag=flag+1;
		
		if(flag==rowNo) {
			System.out.println(data);
			break; // for moving out of the loop when condition will match
		}
		
		}		
	}

	public static void main(String[] args) throws IOException {
		dataReadAssignment1 d=new dataReadAssignment1();
		d.readParticularData(2); //if I am passing 3, then it should read the data of that particular row

	}

}
