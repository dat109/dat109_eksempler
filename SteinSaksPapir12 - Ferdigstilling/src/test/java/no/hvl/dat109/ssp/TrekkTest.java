package no.hvl.dat109.ssp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Testklasse for enum Trekk.
 * 
 * @author Atle Geitung
 */
class TrekkTest {

	@Test
	final void erAntallRiktig() {
		assertEquals(Trekk.antall(), Trekk.values().length);
	}

}
