package com.functionalinterface.com;

public class MainClass {

	public static void main(String[] args) {
		
		
//	Lambda lambda=new Lambda() {
		
//		@Override
//		public void print() {
//			System.out.println("Lambda Workin Fine");
			
//		}
//	};
		
		
		Lambda lambda=(a,b)->(a+b);
	
System.out.println(	lambda.print(2,5));

	}

}
