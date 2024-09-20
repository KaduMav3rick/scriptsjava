package br.com.sigma.veiculos;

public class veiculos {
	
	//Atributos 
	
	private String marca;	
    private String modelo;     
    private int ano;    
    private int potencia;
    private int eixos;
    private int carga;
    
    //Metodos
    
    public veiculos(String marca, String modelo, int ano, int potencia, int eixos, int carga) {
    	super();
    	this.marca = marca;
    	this.modelo = modelo;
    	this.ano = ano;
    	this.potencia = potencia;
    	this.eixos = eixos;
    	this.carga = carga;
    }
    
    
	@Override
	public String toString() {
		return "veiculos [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", potencia=" + potencia
				+ ", eixos=" + eixos + ", carga=" + carga + "]";
	} 
    

}