package com.example.file1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("D:\\file");
		ObjectOutputStream t1 = new ObjectOutputStream(file);
		String s = "hello Welcome :@ 1234";
		t1.writeChars(s);
		t1.flush();
		t1.close();
		file.close();
		System.out.println("Success...");
	}
}
