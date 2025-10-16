package com.demo.test;

import java.util.List;
import java.util.*;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestStreamFunctions {
	public static void main(String[] args) {
		List<Integer> list = List.of(23, 54, 87, 15, 9, 39, 7, 34, 65, 45, 34, 72, 24, 64);

		Optional<Integer> ans = list.stream().max(Integer::compare);
		System.out.println(ans.get());

		Optional<Integer> min = list.stream().min(Integer::compare);
		System.out.println(min.get());

		Optional<Integer> maxodd = list.stream().filter(e -> e % 2 == 1).max(Integer::compare);
		System.out.println(maxodd.get());

		List<Integer> squares = list.stream().map(e -> e * e).collect(Collectors.toList());
		System.out.println(squares);

		Predicate<Integer> p1 = e -> e < 10;
		list.stream().filter(p1).forEach(System.out::println);

	}
}
