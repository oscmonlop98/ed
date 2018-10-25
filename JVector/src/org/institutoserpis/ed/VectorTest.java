package org.institutoserpis.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	void IndexOf() {
		int[] v = new int[] {16, 12, 15, 14, 17};
		assertEquals(0, Vector.indexOf(v, 16));
		assertEquals(1, Vector.indexOf(v, 12));
		assertEquals(2, Vector.indexOf(v, 15));
		assertEquals(3, Vector.indexOf(v, 14));
		assertEquals(4, Vector.indexOf(v, 17));
		assertEquals(-1, Vector.indexOf(v, 33));
	}

	@Test
	void indexOfEmpty() {
		int[] v = new int[] {};
		assertEquals(-1, Vector.indexOf(v, 22));
	}
	
	@Test
	void min () {
		assertEquals(12, Vector.min(new int[] {16, 12, 15, 14, 17}));
	}

}
