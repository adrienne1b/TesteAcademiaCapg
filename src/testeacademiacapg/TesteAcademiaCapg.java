/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeacademiacapg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author adrie
 */
public class TesteAcademiaCapg {

    // Método auxiliar a questaoAnagramas()
    public static boolean verificarRepeticoesDeLetras(String str, char ch) {
        var count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        return count > 1 ? true : false;
    }

    public static void questaoAnagramas() {
        // Lista para guardar os valores repetidos dentro da string digitada
        List<String> lista = new ArrayList<>();

        System.out.println("Digite uma palavra: ");
        Scanner sc = new Scanner(System.in);
        String palavra = sc.next();

        // Array das letras da palavra inserida 
        char[] strArray = palavra.toCharArray();

        for (char d : strArray) {
            if (verificarRepeticoesDeLetras(palavra, d)) {
                if (lista.contains("" + d)) {
                    break;
                }
                lista.add("" + d);
                System.out.println(lista);
            }
        }
        System.out.println(lista.size());
    }

    public static void questaoSenhaSegura() {
        System.out.println("Digite uma senha: ");
        Scanner sc = new Scanner(System.in);
        String senha = sc.next();        
        
        if (senha.length() < 6) {
            int tamanhoMinino = 6 - senha.length();
            System.out.println(tamanhoMinino);
        }
    }

    public static void questaoEscadaRefletida() {
        Scanner entrada = new Scanner(System.in);
        List<String> degrausEscada = new ArrayList<>();

        System.out.println("Digite um número: ");
        int quantidadeDegraus = entrada.nextInt();
        // Inserção dos degraus 
        for (int i = 0; i < quantidadeDegraus; i++) {
            degrausEscada.add(" ".repeat((quantidadeDegraus - 1) - i) + "*".repeat(i + 1));
        }
        // Impressão dos degraus
        for (String d : degrausEscada) {
            System.out.println(d);
        }
    }

    public static void main(String[] args) {
        
        // Menu 
        System.out.println("\t Desafio de Programação \n\n");
        System.out.println("Escolha o número da questão de teste:\n");

        System.out.println("\t1 - Questão Um");
        System.out.println("\t2 - Questão Dois");
        System.out.println("\t3 - Questão Três");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int escolha = entrada.nextInt();
        
        // Verificação das escolhas do teste 
        switch (escolha) {
            case 1 -> questaoEscadaRefletida();
            case 2 -> questaoSenhaSegura();
            case 3 -> questaoAnagramas();
            default -> System.out.println("Insira de 1 a 3 !");
        }
    }
    
}
