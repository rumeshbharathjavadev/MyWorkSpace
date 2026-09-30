package com.filejava.com;

import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {

		// 0,1,1,2,3,5,8,11

		int f = 0;
		int s = 1;
		System.out.print(f + " ");

		System.out.print(s + " ");

		for (int i = 0; i < 10; i++) {

			int t = f + s;

			System.out.print(t + " ");

			f = s;
			s = t;

		}

	}
}
