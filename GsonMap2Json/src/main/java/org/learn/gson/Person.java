package org.learn.gson;

public class Person {
	public String firstName;
	public String lastName;
	public int age;
	public String contact;
	public Person(String firstName, String lastName,
				int age, String contact) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.contact = contact;
	}
	public String toString() {
	    return "[" + firstName + " " + lastName +
		       " " + age + " " +contact +"]";
	}
}