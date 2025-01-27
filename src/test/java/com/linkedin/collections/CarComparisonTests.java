package com.linkedin.collections;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class CarComparisonTests {

	Collection<Car> cars;
	Car subaru, tesla, honda, opel;

	Collection<Guitar> guitars;
	Guitar fender, gibson, prs;

	@BeforeEach
	public void setUp(TestInfo info) throws Exception {

		System.out.format("%nPerforming %s%n", info.getTestMethod().get().getName());


		this.guitars = new ArrayList<>();
		this.fender = new Guitar("Fender", "Strat", 7);
		this.gibson = new Guitar("Gibson", "LP", 6);

		this.guitars.addAll(Arrays.asList(this.fender, this.gibson));

		this.cars = new ArrayList<>();
		this.subaru = new Car("Subaru", "Impreza", 52000);
		this.tesla = new Car("Tesla", "Model S", 10000);
		this.honda = new Car("Honda", "Civic", 25000);
		
		this.cars.addAll(Arrays.asList(this.subaru, this.tesla, this.honda, opel));
	}

	@AfterEach
	public void tearDown() throws Exception {
		
		System.out.format("%nResults%n");
		
//		this.cars.stream()
//			.map(c -> String.format("%s %s", c.getMake(), c.getModel()))
//			.forEach(System.out::println);
	}

	@Test
	public void removeTest() {

		this.cars.remove(honda);
		this.cars.remove(new Car("Subaru", "Impreza", 52000));

		assertEquals(2, this.cars.size());

	}

	@Test
	public void containsTest() {

		assertTrue(this.cars.contains(new Car("Tesla", "Model S", 10000)));
		assertTrue(this.cars.contains(honda)); 
		assertTrue(this.cars.contains(subaru));

	}

	@Test
	public void removeAllIdentityTest() {

		this.cars.removeAll(Arrays.asList(
				this.subaru
				//this.tesla,
				//new Car("Honda", "Civic", 25000)
		));

		assertTrue(this.cars.isEmpty());

	}
}
