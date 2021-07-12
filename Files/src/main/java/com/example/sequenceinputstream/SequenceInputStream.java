package com.example.sequenceinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SequenceInputStream {
	public static void main(String[] args) {

		FileInputStream f1 = null;
		FileInputStream f2 = null;
		FileOutputStream fout = null;
		java.io.SequenceInputStream sc = null;
		try {
			f1 = new FileInputStream("C:\\Users\\prasad podili\\eclipse_mvn\\Files\\src\\main\\java\\file1");
			f2 = new FileInputStream("C:\\Users\\prasad podili\\eclipse_mvn\\Files\\src\\main\\java\\file2");
			fout = new FileOutputStream("C:\\Users\\prasad podili\\eclipse_mvn\\Files\\src\\main\\java\\file3");
			sc = new java.io.SequenceInputStream(f1, f2);

			int i;
			while ((i = sc.read()) != -1) {
				fout.write(i);
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				sc.close();
				fout.close();
				f1.close();
				f2.close();
				System.out.println();
				System.out.println("===========successfull==========");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
