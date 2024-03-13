package Package_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*9th march 2024- Assignment-2- Create a method named ReadDataofRange and pass the initial row No and end row No,that method
 will read the data of that particular range. */
 
public class dataReadAssignment2 {
	
	public void readFromRange(int initial, int end) throws IOException {//2nd to 4th row
		File f= new File("../Project_1/data.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		int flag=0;
		String data;
		while((data=b.readLine())!=null) {
			flag=flag+1;
		
		if((flag>=initial)&&(flag<=end)) { // (2>=2&&2<=4) (3>=2&&3<=4) (4>=2&&4<=4)
			System.out.println(data);
			
		}
		
		}		
	}

	public static void main(String[] args) throws IOException {
		dataReadAssignment2 d=new dataReadAssignment2();
		d.readFromRange(2,4); //if I am passing 3, then it should read the data of that particular row

	}

}

