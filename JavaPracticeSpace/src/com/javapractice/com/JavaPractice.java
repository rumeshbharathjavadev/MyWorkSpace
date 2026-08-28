package com.javapractice.com;

import java.util.LinkedHashSet;
import java.util.Set;

public class JavaPractice {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 20, 40, 50, 10, 30 };

		Set<Integer> hs = new LinkedHashSet<>();

		for (int i = 0; i < arr.length; i++) {

			if(!hs.add(arr[i])){
				hs.add(arr[i]);
			}
		}
		
		for (int a:hs) {
			System.out.println(a);
		}

	}

}
