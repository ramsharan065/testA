package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NirajTest {

	Niraj niraj;

	@Before
	public void setUp() throws Exception {
		niraj = new Niraj();
	}

	@Test
	public void testGetSize() {
		niraj.setName("Niraj");
		assertEquals(new Integer(5), niraj.getSize());
	}

}
