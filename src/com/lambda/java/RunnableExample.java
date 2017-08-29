package com.lambda.java;

public class RunnableExample {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside runnable");
			}
		});
		thread.run();

		Thread myLambdaThread = new Thread(() -> System.out.println("Inside labda Runnable"));
		myLambdaThread.run();
	}
}
