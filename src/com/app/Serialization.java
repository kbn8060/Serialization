package com.app;

import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) throws Exception {
		Student s = new Student(211, "ravi");
		FileOutputStream fos = new FileOutputStream("f.txt");
		@SuppressWarnings("resource")
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(s);
		out.flush();
		System.out.println("Success");
	}
}
