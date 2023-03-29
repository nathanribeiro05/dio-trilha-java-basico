import java.util.Scanner;

public class Ex4_Tabuada {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);
        System.out.println("Número: ");
        int numero = scan.nextInt();

        System.out.println("Tabuada de número " + numero + ":");

            if (numero >= 1 & numero <= 10){
            int primeiroNumero = numero * 1;
            System.out.println(numero + " X 1 = " + primeiroNumero);

            int segundoNumero = numero * 2;
            System.out.println(numero + " X 2 = " + segundoNumero);

            int terceiroNumero = numero * 3;
            System.out.println(numero + " X 3 = " + terceiroNumero);

            int quartoNumero = numero * 4;
            System.out.println(numero + " X 4 = " + quartoNumero);

            int quintoNumero = numero * 5;
            System.out.println(numero + " X 5 = " + quintoNumero);

            int sextoNumero = numero * 6;
            System.out.println(numero + " X 6 = " + sextoNumero);

            int setimoNumero = numero * 7;
            System.out.println(numero + " X 7 = " + setimoNumero);
            
            int oitavoNumero = numero * 8;
            System.out.println(numero + " X 8 = " + oitavoNumero);

            int nonoNumero = numero * 9;
            System.out.println(numero + " X 9 = " + nonoNumero);

            int decimoNumero = numero * 10;
            System.out.println(numero + " X 10 = " + decimoNumero);
        } else {
            System.out.println("Número inválido.");
        } scan.close();
    }
}
