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
		spillere = new ArrayList<>(2);
		spillere.add(new Spiller("Per"));
		spillere.add(new Spiller("Kari"));
	}

	/**
	 * Oppretter spillet.
	 */
	public SteinSaksPapir() {
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
