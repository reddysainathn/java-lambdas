package com.lambda.java;

public class JavaLambdas {

	/*
	 * OOPS Java public String addString() { return "Hello World"; }
	 */

	// Functional

	private String addString(LambdaInterface lambdaInterface) {
		return lambdaInterface.greet();
	}

	public static void main(String[] args) {
		JavaLambdas javaLambdas = new JavaLambdas();
		LambdaImplementation lambdaImplementation = new LambdaImplementation();
		System.out.println(lambdaImplementation.greet());

		MyLambda mylambdaExpression = () -> "Hello World from lambda";
		System.out.println(mylambdaExpression.addString());

		MyLambdaVoid myLambdaVoid = () -> System.out.println("Hello World from labda Void");
		myLambdaVoid.addString();

		MyLambdaAddDoubles lambdaAddDoubles = (Double x, Double y) -> x + y;
		System.out.println("My lambda Double Adds " + lambdaAddDoubles.addDoubles(2.2, 33.3));
		// Anonymous class
		LambdaInterface lambdaInterface = new LambdaInterface() {
			@Override
			public String greet() {
				// TODO Auto-generated method stub
				return "Hello World from Anonymous class";
			}
		};
		System.out.println(lambdaInterface.greet());
	}

	interface MyLambda {
		String addString();
	}

	interface MyLambdaVoid {
		void addString();
	}

	interface MyLambdaAddDoubles {
		Double addDoubles(Double x, Double y);
	}
}
