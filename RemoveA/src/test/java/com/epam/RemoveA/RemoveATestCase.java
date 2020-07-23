package com.epam.RemoveA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveATestCase {
	/*
	 *  Remove A from first 2 letters
	 *  1. ABCD -> BCD - success
	 *  2. AACD -> CD - success
	 *  3. BACD -> BCD
	 *  4. BBAA -> BBAA
	 *  5. AABAA -> BAA
	 */
	@Test
	void testFirstChar() {
		RemoveA rmA = new RemoveA();
		String actual = rmA.remove("ABCD");
		assertEquals("BCD", actual);
	}
	@Test
	void testFirstTwoChar() {
		RemoveA rmA = new RemoveA();
		String actual = rmA.remove("AACD");
		assertEquals("CD", actual);
	}
	@Test
	void testSecondChar() {
		RemoveA rmA = new RemoveA();
		String actual = rmA.remove("BACD");
		assertEquals("BCD", actual);
	}
	@Test
	void testFirstTwoCharNotA() {
		RemoveA rmA = new RemoveA();
		String actual = rmA.remove("BBAA");
		assertEquals("BBAA", actual);
	}
	@Test
	void testFirstTwoCharA() {
		RemoveA rmA = new RemoveA();
		String actual = rmA.remove("AABBAA");
		assertEquals("BBAA", actual);
	}

}
