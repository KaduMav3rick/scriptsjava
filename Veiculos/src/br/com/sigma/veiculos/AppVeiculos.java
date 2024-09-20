package br.com.sigma.veiculos;

public class AppVeiculos {

    public static void main(String[] args) {

        
        veiculos caminhonete = new veiculos("Fiat", "Uno", 2020, 64, 4, 3800);
        veiculos utilitario = new veiculos("Gol", "Volkswagem", 2010, 16, 8, 4600);
        veiculos esporte = new veiculos("Fusca", "Volkswagem", 2020, 8, 8, 3589);
        veiculos passeio = new veiculos("S10", "Chevrolet", 2019, 120, 32, 8965);
        veiculos passageiros = new veiculos("GM", "Caminhão", 2022, 450, 64, 28097);
        
        // Exibe a marca do veículo
        System.out.println(caminhonete);
        System.out.println(utilitario);
        System.out.println(esporte);
        System.out.println(passeio);
        System.out.println(passageiros);
        
        
     	
    }
}

