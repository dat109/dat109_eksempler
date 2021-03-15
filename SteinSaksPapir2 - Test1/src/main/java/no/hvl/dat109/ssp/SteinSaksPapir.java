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
	 * Spiller et spill. Gir resultatet til de to spillerne.
	 * 
	 * @param trekk1 resultatet til spiller 1
	 * @param trekk2 resultatet til spiller 2
	 */
	public void spill(Trekk trekk1, Trekk trekk2) {
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
