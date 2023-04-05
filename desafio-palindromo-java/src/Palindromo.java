public class Palindromo {
    public boolean  isPalindrome(int x) {

        String s = String.valueOf(x); // Converter int x para string s
        int n = s.length(); // n será o numero referente ao comprimento da string

        for (int i = 0; i<n/2; i++){
    // Agora faremos a conferência entre os elementos com a mesma distancia
    //do inicio e do final para ver se são iguais. Se sim, retorne true, se não, false.
            if (s.charAt(i) != s.charAt(n-i-1)) return false;

        } return true;

    }
}