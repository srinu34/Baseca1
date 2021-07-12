package com.example.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintWriter;

public class FileOutput {
	public static void main(String[] args) throws IOException
	{
		final PipedOutputStream pout = new PipedOutputStream();
		final PipedInputStream pin = new PipedInputStream();

		pout.connect(pin);// connecting the streams

		// creating one thread t1 which writes the data
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 65; i <= 90; i++) {
					try {
						pout.write(i);
						System.out.println("Thread 1 writing: " + i);
						Thread.sleep(1000); // 1000 milliseconds
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
			}
		};
		// creating another thread t2 which reads the data
		Thread t2 = new Thread() {
			public void run() {
				try {
					for (int i = 65; i <= 90; i++)
						System.out.println("Thread 2 Reading: " + pin.read());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		};
		// starting both threads
		t1.start();
		t2.start();
	}

	}


