package com.lambda.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise1 {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Hell", "Bell", 1), new Person("Yell", "Cell", 2));
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}

		});

		printAll(persons);

		printLastNameBeginningWithC(persons);
	}

	private static void printLastNameBeginningWithC(List<Person> persons) {
		for (Person person : persons) {
			if (person.getLastName().startsWith("C"))
				;
			System.out.println(person.toString());
		}

	}

	private static void printAll(List<Person> persons) {
		for (Person person : persons) {
			System.out.println(person.toString());
		}
	}

}
