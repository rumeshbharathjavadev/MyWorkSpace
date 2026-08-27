package com.javapractice.com;

public class JavaPractice {

	public static void main(String[] args) {

		int arr[]= {10,15,20,8,20,15,45};
		
		int first=0;
		int sec=0;
		
		
		for (int i=0;i<arr.length;i++) {
			
			
			if (first>arr[i]) {
				first=arr[i];
				sec=first;
			}else if (sec>arr[i]) {
				
				sec=arr[i];
			}
			
		}
		
		System.out.println("Sec Output "+sec);
		
	}

}
