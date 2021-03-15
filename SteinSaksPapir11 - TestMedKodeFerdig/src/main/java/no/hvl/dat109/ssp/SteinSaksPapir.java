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
	
	private List<Spiller> spillere;
	{
		spillere = new ArrayList<>(3);
		spillere.add(new Spiller("Uavgjort"));
		spillere.add(new Spiller("Per"));
		spillere.add(new Spiller("Kari"));
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
		Spiller uavgjort = spillere.get(0);
		Spiller spiller1 = spillere.get(1);
		Spiller spiller2 = spillere.get(2);
		spiller1.setTrekk(trekk1);
		spiller2.setTrekk(trekk2);
		
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
