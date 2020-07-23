package com.epam.RemoveA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveATestCase {
	/*
	 *  Remove A from first 2 letters
	 *  1. ABCD -> BCD - success
	 *  2. AACD -> CD - success
	 *  3. BACD -> BCD - success
	 *  4. BBAA -> BBAA - success
	 *  5. AABAA -> BAA - success
	 */
	RemoveA rmA;
	@BeforeEach
	void setup() {
		rmA = new RemoveA();
	}
	@Test
	void testFirstChar() {
		assertEquals("BCD", rmA.remove("ABCD"));
	}
	@Test
	void testFirstTwoChar() {
		assertEquals("CD", rmA.remove("AACD"));
	}
	@Test
	void testSecondChar() {
		assertEquals("BCD", rmA.remove("BACD"));
	}
	@Test
	void testFirstTwoCharNotA() {
		assertEquals("BBAA", rmA.remove("BBAA"));
	}
	@Test
	void testFirstTwoCharA() {
		assertEquals("BBAA", rmA.remove("AABBAA"));
	}

}
