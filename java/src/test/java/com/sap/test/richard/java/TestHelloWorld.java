package com.sap.test.richard.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestHelloWorld {

	@Test
	public void testGreeting() {
		assertEquals("Hello World", HelloWorld.getGreeting());
	}
}
