import java.util.Scanner;

public class Ex5_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int numero = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(numero + "! = ");
        for (int i = numero; i > 0; i--){
        multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);
        
       
        scan.close();
    } 
}
