package com.javapractice.com;

public class JavaPractice {

	public static void main(String[] args) {

		int arr[] = {10, 15, 20, 8, 20, 15, 45};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        System.out.println("Second Largest: " + second);
    }
	

}
