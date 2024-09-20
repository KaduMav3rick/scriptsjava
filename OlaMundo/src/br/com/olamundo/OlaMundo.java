package br.com.olamundo;

public class OlaMundo {

    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");
        System.out.println();
        System.out.println("Me livrei da maldição do Linus!");
        System.out.println();
        
        System.out.println("=================================");
        
        int idade = 19;
        long tempo = 12312;
        float PI = 3.14f;
        double raio = PI * 2;
        char sexo = 'M';
        String primeiroNome = "Kadu Maverick";
        String sobrenome = "Burga Goncalves";  // Corrigido o nome da variável
        String nomeCompleto = primeiroNome + " " + sobrenome;  // Corrigido o nome da variável
        
        System.out.println("Olá! Seja bem-vindo " + nomeCompleto + ", sua idade é " + idade + " anos.");
    }
}

