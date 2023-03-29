import java.util.Scanner;

public class Ex3_ParImpar {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Quantidade de números: ");
        int quantidadeDeNumeros = scan.nextInt();
        int quantidadePar = 0, quantidadeImpar = 0;
        int count = 0;

        do{
            System.out.println("Número: ");
            int numero = scan.nextInt();

            if (numero % 2 == 0)  quantidadePar++;
            else quantidadeImpar++;
                
                 count++;
            } while (count < quantidadeDeNumeros);

            System.out.println("Quantidade de pares: " + quantidadePar);
            System.out.println("QUantidade de ímpares: " + quantidadeImpar);
        } 

    }
