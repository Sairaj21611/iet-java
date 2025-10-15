package com.demo.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileHandling {
	public static void main(String[] args) {
		try (FileInputStream fs = new FileInputStream("myfile.txt");
				FileOutputStream os = new FileOutputStream("output.txt")) {

			
			
			
			int i;
			while ((i = fs.read()) != -1) {
				os.write(i);
			}
			System.out.println("File copied successfully.");

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
