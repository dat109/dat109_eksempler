package no.hvl.dat109.ssp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tester spiller i stein, saks og papir.
 * 
 * @author Atle Geitung
 */
class SpillerTest {

	private Spiller spiller;

	@BeforeEach
	void setUp() {
		spiller = new Spiller();
	}

	@Test
	final void erTrekkGyldig() {
		// Denne testen er litt overflødig da det blir kjørefeil hvis ikke.
		spiller.trekk();
	}

	@Test
	final void erTrekkLiktFordelt() {
		int[] antall = new int[Trekk.antall()];
		for(int i = 0; i < 30000; i++) {
			spiller.trekk();
			antall[spiller.getTrekk().ordinal()]++;
		}
		// 2% avvik aksepteres
		assertTrue(antall[0] < 10200 && antall[0] > 9800);
		assertTrue(antall[1] < 10200 && antall[1] > 9800);
		assertTrue(antall[2] < 10200 && antall[2] > 9800);
	}

}
