/*Dado um inteiro x, retorne true se ele for palíndromo e false se não for. */

import java.util.Scanner;

public class Palindromo {    
    
        public static boolean isPalindrome (int x){        
        String s = String.valueOf(x); // converter int x para string s
        int n = s.length(); // n é igual ao numero correspondente ao comprimento de s

        for (int i = 0; i < n/2; i++){
            // confere para ver se os elementos qeuidistantes são iguais
            //caso não forem, retorna false. caso forem, retorna true
            if (s.charAt(i) != s.charAt (n-i-1)) return false;
            
        }
        return true;
}
public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Insira o número: ");
        int x = scan.nextInt();    
        System.out.println("O número é palíndromo? ");
        System.out.println(isPalindrome (x));
    }
} 

} 

 