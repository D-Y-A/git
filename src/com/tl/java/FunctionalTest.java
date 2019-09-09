package com.tl.java;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;

public class FunctionalTest {

	@Test
	public void test2(){
		
		//有参无返回值
		new Consumer<String>(){

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				
			}
			
		};
		Consumer<String> con = t -> System.out.println("asa");
		
		//无参有返回值
		new Supplier<String>(){

			@Override
			public String get() {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
		
		Supplier<String> su = () -> null;
		//有参有返回值类型
		new Function<String,Boolean>(){

			@Override
			public Boolean apply(String t) {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
		
		Function<String,Boolean> fun = t -> false;
		
		new Predicate<Integer>(){

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		Predicate<Integer> p = t -> 1 == 2;
		
	}
	
	
	@Test
	public void test(){
		new Comparable<String>(){

			@Override
			public int compareTo(String o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		System.out.println("------lambda--------");
		
		Comparable<String> com = s -> 1;
	}
}
