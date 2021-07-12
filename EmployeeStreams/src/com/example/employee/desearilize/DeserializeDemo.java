package com.example.employee.desearilize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.example.se.entity.Employee;

public class DeserializeDemo {

	public static void main(String[] args) {
		FileInputStream f = null;
		ObjectInputStream ob = null;
		try {
			f = new FileInputStream("C:\\Users\\prasad podili\\eclipse_mvn\\EmployeeStreams\\src\\file1");
			ob = new ObjectInputStream(f);
			Employee e = (Employee) ob.readObject();
			System.out.println(e.getId() + " " + e.getName() + " " + e.getAge());
			System.out.println();
		} catch (IOException e1) {

			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} finally {
			try {
				ob.close();
				f.close();
				System.out.println("==========successfull============");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
