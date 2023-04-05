/*Você está subindo uma escada. Ela leva n degraus para ser vencida.
  Você pode subir 1 degrau por vez ou 2 degraus por vez. 
  Dado n, de quantas formas você pode subir a escada? 
  
  Exemplo:
  Entrada             Saída
  3                   3
  
  Explicação: Há 3 formas de subir a escada:
  - 1 degrau + 1 degrau + 1 degrau
  - 1 degrau + 2 degraus
  - 2 degraus + 1 degrau*/
  
import java.util.Scanner;

public class DesafioEscada {
    public static int climbStairs (int n){
        if (n <= 2) return n;

        int a[] = new int [n];
        a[0] = 1;
        a[1] = 2;

        for (int i = 2; i < n; i++){
            a[i] = a[i-1] + a[i-2];
        } return a[n-1];
    }
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Insira o número de degraus: ");
            int n = scan.nextInt();
            System.out.println("De quantas maneiras dá pra subir? ");
            System.out.println(climbStairs (n));

        }
    }
}
