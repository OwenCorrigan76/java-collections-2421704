package com.linkedin.collections;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		List<String> c = new ArrayList<>();
		c.add("Fender");
		c.add("Gibson");
		c.add("PRS");
		c.add("PRS");
		c.add("Gretch");

		Set<String> favGuitars = new HashSet<>(c);

		System.out.println(favGuitars);
	}

}
