//Neste desafio, faça um programa que calcule o valor de H com N termos. 
//Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N. 
//Entrada                    Saída
//4                          2
//8                          3
//3                          2
import java.util.Scanner;

public class ExercicioSoma {

    public static void main(String[] Args) {

     double h = 0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Insira o valor de n: ");
     int n = sc.nextInt();

     for (int i = 1; i <= n; i++) {
          
          h = h + 1d/i;
      }
     System.out.println(String.format("%.0f", h));
       sc.close();
   }
}
