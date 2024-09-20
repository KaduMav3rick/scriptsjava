package br.com.smartweb.midias;

public class Cd extends Item {
	
	private String aerist;
	private int numberOfTracks;
	
	

	public Cd(String aerist, int numberOfTracks) {
		super();
		this.aerist = aerist;
		this.numberOfTracks = numberOfTracks;
	}

	@Override
	public String toString() {
		return "Cd [aerist=" + aerist + ", numberOfTracks=" + numberOfTracks + "]";
	}

	public String getAerist() {
		return aerist;
	}

	public void setAerist(String aerist) {
		this.aerist = aerist;
	}

	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}
	
	

}
