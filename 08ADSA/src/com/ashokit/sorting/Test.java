package com.ashokit.sorting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Test {

	public static void main(String[] args) throws IOException {
		//Path p= Path.of("C:\\Users\\Dell\\Downloads\\OUT_16649_2121112922003530076.pdf");
		String s=Files.readString(Path.of("C:\\Users\\Dell\\Downloads\\OUT_16649_2121112922003530076.pdf"));
		System.out.println(s);
	}
}
