package br.com.smartweb.midias;

public class Item {
	private String tittle;
	private int playthingTime;
	private boolean gotIt;
	private String comment ;
	
	
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(String tittle, int playthingTime, boolean gotIt, String comment) {
		super();
		this.tittle = tittle;
		this.playthingTime = playthingTime;
		this.gotIt = gotIt;
		this.comment = comment;
		
		
		
	}
	@Override
	public String toString() {
		return "Item [tittle=" + tittle + ", playthingTime=" + playthingTime + ", gotIt=" + gotIt + ", comment="
				+ comment + "]";
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public int getPlaythingTime() {
		return playthingTime;
	}
	public void setPlaythingTime(int playthingTime) {
		this.playthingTime = playthingTime;
	}
	public boolean isGotIt() {
		return gotIt;
	}
	public void setGotIt(boolean gotIt) {
		this.gotIt = gotIt;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	

}
