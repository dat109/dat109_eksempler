package no.hvl.dat109.ssp;

import java.util.ArrayList;
import java.util.List;

/**
 * Simulerer spillet stein, saks og papir.
 * 
 * @author Atle Geitung
 */
public class SteinSaksPapir {

	private Spiller vinner = null;
	private Spiller uavgjort;
	private Spiller spiller1;
	private Spiller spiller2;

	private List<Spiller> spillere;
	{
		uavgjort = new Spiller("Uavgjort");
		spiller1 = new Spiller("Per");
		spiller2 = new Spiller("Kari");
		spillere = new ArrayList<>(3);
		spillere.add(uavgjort);
		spillere.add(spiller1);
		spillere.add(spiller2);
	}

	/**
	 * Oppretter spillet.
	 */
	public SteinSaksPapir() {
	}

	/**
	 * Spiller et spill. Setter trekkene til de to spillerne.
	 * 
	 * @param trekk1 trekket til spiller 1
	 * @param trekk2 trekket til spiller 2
	 */
	public void spill(Trekk trekk1, Trekk trekk2) {
		spiller1.setTrekk(trekk1);
		spiller2.setTrekk(trekk2);

		finnResultat();
	}

	/**
	 * Spiller et spill. Spillerne gjør trekk inntil vinner kan kåres.
	 */
	public void spill() {
		do {
			spiller1.trekk();
			spiller2.trekk();

			finnResultat();
		} while (vinner == uavgjort);
	}

	/**
	 * Finner resultat av en runde stein, saks og papir.
	 */
	private void finnResultat() {
		if (spiller1.getTrekk() == spiller2.getTrekk()) {
			// uavgjort
			vinner = uavgjort;
		} else if (spiller1.getTrekk() == Trekk.STEIN) {
			if (spiller2.getTrekk() == Trekk.SAKS) {
				vinner = spiller1;
			} else if (spiller2.getTrekk() == Trekk.PAPIR) {
				vinner = spiller2;
			}
		} else if (spiller1.getTrekk() == Trekk.PAPIR) {
			if (spiller2.getTrekk() == Trekk.SAKS) {
				vinner = spiller2;
			} else if (spiller2.getTrekk() == Trekk.STEIN) {
				vinner = spiller1;
			}
		} else if (spiller1.getTrekk() == Trekk.SAKS) {
			if (spiller2.getTrekk() == Trekk.PAPIR) {
				vinner = spiller1;
			} else if (spiller2.getTrekk() == Trekk.STEIN) {
				vinner = spiller2;
			}
		}
	}
	
	/**
	 * @return Vinneren
	 */
	public Spiller getVinner() {
		return vinner;
	}

	/**
	 * @return Spillerne
	 */
	public List<Spiller> getSpillere() {
		return spillere;
	}

}
