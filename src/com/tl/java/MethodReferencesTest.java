package com.tl.java;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;

import org.junit.Test;

public class MethodReferencesTest {

	@Test
	public void test(){
		new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		
		System.out.println("-----lambda----------");
		Comparator<String> s = (t1,t2) -> t1.compareTo(t2);
		System.out.println("---------方法的引用-------");
		Comparator<String> s2 = String::compareTo;
	}
	
	@Test
	public void test2(){
		new Function<String,Integer>(){

			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
		System.out.println("--------lambda-------------");
		Function<String,Integer> fun = t -> 1;
		System.out.println("------方法的引用----------");
		Function<String,Integer> fun2 = Integer::parseInt;
	}
	
	
	@Test
	public void test3(){
		new Consumer<String>(){

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println();
				System.out.println(t);
			}
			
		};
		
		Consumer<String> con = System.out::println;
		con.accept("ss");
	}

}
