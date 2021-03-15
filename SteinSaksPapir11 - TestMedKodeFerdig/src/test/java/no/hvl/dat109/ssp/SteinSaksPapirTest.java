package no.hvl.dat109.ssp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Testklasse som tester enheten (spillet) stein, saks og papir.
 * 
 * @author Atle Geitung
 */
class SteinSaksPapirTest {
	
	private SteinSaksPapir spill;
	private Spiller uavgjort;
	private Spiller spiller1;
	private Spiller spiller2;

	@BeforeEach
	void setup() {
		spill = new SteinSaksPapir();
		uavgjort = spill.getSpillere().get(0);
		spiller1 = spill.getSpillere().get(1);
		spiller2 = spill.getSpillere().get(2);
	}

	@Test
	final void toSteinErUavgjort() {
		spill.spill(Trekk.STEIN, Trekk.STEIN);
		assertEquals(spill.getVinner(), uavgjort);
	}

	@Test
	final void toPapirErUavgjort() {
		spill.spill(Trekk.PAPIR, Trekk.PAPIR);
		assertEquals(spill.getVinner(), uavgjort);
	}

	@Test
	final void toSaksErUavgjort() {
		spill.spill(Trekk.SAKS, Trekk.SAKS);
		assertEquals(spill.getVinner(), uavgjort);
	}

	@Test
	final void steinVinnerOverSaks() {
		spill.spill(Trekk.STEIN, Trekk.SAKS);
		assertEquals(spill.getVinner(), spiller1);
	}

	@Test
	final void saksVinnerOverPapir() {
		spill.spill(Trekk.SAKS, Trekk.PAPIR);
		assertEquals(spill.getVinner(), spiller1);
	}

	@Test
	final void papirVinnerOverStein() {
		spill.spill(Trekk.PAPIR, Trekk.STEIN);
		assertEquals(spill.getVinner(), spiller1);
	}

	@Test
	final void steinTaperForPapir() {
		spill.spill(Trekk.STEIN, Trekk.PAPIR);
		assertEquals(spill.getVinner(), spiller2);
	}

	@Test
	final void papirTaperForSaks() {
		spill.spill(Trekk.PAPIR, Trekk.SAKS);
		assertEquals(spill.getVinner(), spiller2);
	}

	@Test
	final void saksTaperForStein() {
		spill.spill(Trekk.SAKS, Trekk.STEIN);
		assertEquals(spill.getVinner(), spiller2);
	}

}
