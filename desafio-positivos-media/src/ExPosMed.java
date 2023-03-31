/*Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. 
Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.
 
Exemplo de Entrada	   Exemplo de Saída
7                      4 valores positivos
-5                     7.4
6
-3.4
4.6
12                       */

import java.io.IOException;
import java.util.Scanner;

public class ExPosMed {
    public static void main(String[] args) throws IOException {
        try (Scanner leitor = new Scanner(System.in)) {
            int cont = 0;
            double media = 0;
            double x;
            
               for (int i = 0; i < 6; i++) {
                 x = leitor.nextDouble();
                 if (x > 0){
                   cont++;
                   media += x;
                    }
                   }
                   
                   media = media/cont ;
               System.out.println(cont + " valores positivos");
               System.out.println(String.format("%.1f", media));
        }
             } 
           }
