package br.com.smartweb.midias;

public class AppMidias {
	public static void main (String[] args) {
		Item item1 = new Item();
		item1.setComment("vemci a heramca");
		Cd cd1 = new Cd("Canções de POO", 20);
		cd1.setTittle("BittersweeMemories");
		
		System.out.println(item1.getComment());
		
		System.out.println(cd1);
		System.out.println(cd1.getTittle());
		
		
	}

}
