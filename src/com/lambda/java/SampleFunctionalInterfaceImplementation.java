package com.lambda.java;

public class SampleFunctionalInterfaceImplementation {
	public static void main(String[] args) {
		SampleFunctionalInterface sampleFunctionalInterface = () -> "Hello From Here";
		System.out.println(sampleFunctionalInterface.getString());
	}
}
