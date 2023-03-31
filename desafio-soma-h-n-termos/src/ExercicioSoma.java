
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
