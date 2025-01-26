package com.linkedin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<Guitar> g = new ArrayList<>();

		g.add(new Guitar("Fender", "Strat", 6));
		g.add(new Guitar("Gibson", "Les Paul", 6));

		g.forEach(e -> System.out.println("Make: " + e.getMake()));
		System.out.println(g);

		Collection<Room> c = new ArrayList<>(); //Same Collection Type, Different Element Type
		//Collection c2 = new ArrayList(); //Same Collection Type, Different Element Type
		c.add(new Room("Cambridge", "Suite", 6, 250.0));
		c.forEach(e -> System.out.println("Cap: " + e.getCapacity() + "\nName: " + e.getName()));

	}

}
