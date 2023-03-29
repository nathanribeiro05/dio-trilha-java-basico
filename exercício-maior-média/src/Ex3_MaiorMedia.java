import java.util.Scanner;

public class Ex3_MaiorMedia {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double maior = 0;
        double soma = 0;
        double media;
        int count = 0;        

        do{
            System.out.println("Número: ");
            double numero = scan.nextDouble();

            if (numero > maior){
                maior = numero;
            }

            soma = soma + numero;
            count++;
        } while (count < 5);
        media = soma/5;
        System.out.println("O maior número é: " + maior);
        System.out.println("A média entre os números é: " + media);
    }
}
