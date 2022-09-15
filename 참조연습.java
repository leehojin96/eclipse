package day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q10 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream("in.txt");
		FileOutputStream fout = new FileOutputStream("output.txt");
		
		
		int x;
//		x = fin.read();
//		fout.write(x);
//		
//		x = fin.read();
//		fout.write(x);
//
//		x = fin.read();
//		fout.write(x);
//
//		x = fin.read();
//		fout.write(x);
//				
//		x = fin.read();
//		fout.write(x);
		
		while((x=fin.read())!=-1){
			fout.write(x);
			System.out.print(x + " " + (char)x + " ");
		}
		
	}

}
