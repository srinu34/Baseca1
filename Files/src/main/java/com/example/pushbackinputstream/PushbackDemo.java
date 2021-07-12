package com.example.pushbackinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;

public class PushbackDemo {
	public static void main(String[] args) {
    	FileInputStream f1=null;
		FileInputStream f2=null;
		FileInputStream f3=null;
		SequenceInputStream s=null;
		SequenceInputStream sc=null;
		PushbackInputStream pm=null;
		try {
			f1 = new FileInputStream("C:\\Users\\prasad podili\\eclipse_mvn\\Files\\src\\main\\java\\file1");

			f2= new FileInputStream(
					"C:\\Users\\prasad podili\\eclipse_mvn\\Files\\src\\main\\java\\file2");
			f3 = new FileInputStream(
					"C:\\Users\\prasad podili\\eclipse_mvn\\Files\\src\\main\\java\\file3");

			s = new SequenceInputStream(f1, f2);
			sc = new SequenceInputStream(f3, s);
			pm = new PushbackInputStream(sc);
		
			
			int ch;
			while ((ch = pm.read()) != -1) {
				if (ch == 'h') {
					int j;
					if ((j = pm.read()) == 'i') {
						System.out.print("**");
					} else
						pm.unread(j);
					System.out.print((char) j);
				} else {
					System.out.print((char) ch);
				}
			}

			System.out.println();
			System.out.println("==========Successfull==========");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				pm.close();
				sc.close();
				s.close();
				f1.close();
				f2.close();
				f3.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
