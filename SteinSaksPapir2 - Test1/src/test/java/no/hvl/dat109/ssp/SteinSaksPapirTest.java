package no.hvl.dat109.ssp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Testklasse som tester enheten (spillet) stein, saks og papir.
 * 
 * @author Atle Geitung
 */
class SteinSaksPapirTest {

	@Test
	final void toSteinErUavgjort() {
		SteinSaksPapir spill = new SteinSaksPapir();
		spill.spill(Trekk.STEIN, Trekk.STEIN);
		assertEquals(spill.getVinner(), spill.getSpillere().get(0));
	}

}
