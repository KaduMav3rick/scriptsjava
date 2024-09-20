package br.com.smartweb.desafios; // Define o pacote onde a classe está localizada.

import javax.swing.JOptionPane; // Importa a classe JOptionPane para criar diálogos de entrada e saída.

public class LacoMaluco2 { // Início da definição da classe LacoMaluco2.

    public static void main(String[] args) { // Método principal, ponto de entrada da aplicação.
        
        double numero, media, soma; // Declara variáveis: numero (entrada do usuário), media (resultado) e soma (acúmulo).
        int cont; // Declara uma variável para contar quantos números foram digitados.
        
        cont = 0; // Inicializa o contador de números digitados.
        soma = 0; // Inicializa a soma dos números digitados.

        do { // Início de um loop que continuará até que 5 números sejam digitados.
            // Solicita ao usuário que digite um número e converte a entrada para double.
            numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o número: "));
            
            soma += numero; // Acumula o número digitado na variável soma.
            cont++; // Incrementa o contador a cada número digitado.

        } while (cont < 5); // Continua o loop enquanto menos de 5 números foram digitados.
        
        media = soma / cont; // Calcula a média dividindo a soma pelo contador.

        // Exibe a média calculada em um diálogo.
        JOptionPane.showMessageDialog(null, "A média é: " + media);
    }
}
