package com.lambda.java;

public class TypeInterfaceExample {
	public static void main(String[] args) {

		StringLengthLambda stringLengthLambda = (String s) -> s.length();
		StringLengthLambda stringLengthLambda1 = (s) -> {
			if (s.length() > 10) {
				System.out.println("In If");
				return s.length();
			} else {
				System.out.println("In Else");
				return s.length();
			}
		};
		System.out.println(stringLengthLambda.getLength("Ya its the length!"));
		System.out.println(stringLengthLambda1.getLength("Ya its the length!"));
	}

	interface StringLengthLambda {
		int getLength(String s);
	}
}
