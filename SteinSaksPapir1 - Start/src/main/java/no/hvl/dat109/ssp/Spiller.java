package no.hvl.dat109.ssp;

/**
 * Simulerer en spiller i spillet stein, saks og papir.
 * 
 * @author Atle Geitung
 */
public class Spiller {

	private String navn;

	private Trekk trekk;
	
	/**
	 * Lager en ny spiller uten navn.
	 */
	public Spiller() {
		
	}

	/**
	 * Lager en ny spiller med navn.
	 * 
	 * @param navn Navnet til spilleren
	 */
	public Spiller(String navn) {
		this.navn = navn;
	}

	/**
	 * @return Siste trekk.
	 */
	public Trekk getTrekk() {
		return trekk;
	}

	/**
	 * @param trekk Nytt trekk
	 */
	public void setTrekk(Trekk trekk) {
		this.trekk = trekk;
	}

	/**
	 * @return Spillerens navn
	 */
	public String getNavn() {
		return navn;
	}

	/**
	 * @param navn Nytt navn til spiller
	 */
	public void setNavn(String navn) {
		this.navn = navn;
	}

	
}
