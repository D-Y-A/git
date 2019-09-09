package com.tl.java;

import java.util.function.Function;

import org.junit.Test;

public class ConstrctorReferencesTest {

	@Test
	public void test2(){
		new Function<Integer,Person[]>(){

			@Override
			public Person[] apply(Integer t) {
				// TODO Auto-generated method stub
				return new Person[t];
			}
			
		};
		
		Function<Integer,Person[]> fun = t -> new Person[t];
		fun = Person[]::new;
	}
	
	
	@Test
	public void test(){
		new Function<Integer,Person>(){

			@Override
			public Person apply(Integer t) {
				// TODO Auto-generated method stub
				return new Person(t);
			}
			
		};
		Function<Integer,Person> fun = t->new Person(t);
		
		Function<Integer,Person> fun2 = Person::new;
	}
}
class Person{
	int age;
	public Person(int age){
		this.age = age;
	}
}