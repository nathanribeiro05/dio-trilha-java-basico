/*A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. 
Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. 
Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série. 

Exemplo de Entrada	  Exemplo de Saída
5                     0 1 1 2 3*/

import java.io.IOException;
import java.util.Scanner;

public class ExFibonacci {

    public static void main(String[] args) throws IOException {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Comprimento da sequência: ");
            int N = leitor.nextInt();

            int proximo, anterior = 0, atual = 1;
            System.out.println("Sequência: ");
            for (int i = 1; i <= N; i++) {
              if (i == N) System.out.println(anterior);       
    
            	else System.out.print(anterior + " ");
            	proximo = anterior + atual;
            	anterior = atual; 
            	atual = proximo; 
            }
        }
    } 
	
}