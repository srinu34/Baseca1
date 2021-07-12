package com.example.employee.serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.example.se.entity.Employee;

public class SerializeDemo {
	public static void main(String[] args) {
		Employee e = new Employee(1, "aaa", 20);
		FileOutputStream fout = null;
		ObjectOutputStream ob = null;
		try {
			fout = new FileOutputStream("C:\\Users\\prasad podili\\eclipse_mvn\\EmployeeStreams\\src\\file1");
			ob = new ObjectOutputStream(fout);
		} catch (IOException e1) {

			e1.printStackTrace();
		} finally {
			try {
				ob.writeObject(e);
				ob.flush();
				ob.close();
				fout.close();
				System.out.println("==========successfull========");
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}
	}

}
