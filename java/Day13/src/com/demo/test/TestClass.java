package com.demo.test;

import java.util.List;
import java.util.Optional;

public class TestClass {
	public static void main(String[] args) {
		List<Integer> lst = List.of(23,12,34,56,22,54,87,28,82,45,12);
		
		Optional<Integer> maximum = lst.stream().max(Integer::compare);
		System.out.println(maximum.get());
		
	}
}
