public class Main {

    public static void main(String[] args) {
//        soma(10);
//        fatorial(5);
//        contaDigitos(5679);
//        inverterDigitos(543);
//        potencia(4, 2);
//        palindromo(17871);
//        converterParaDecimal(1010);
//        multiplos(2, 14);
    }

    public static void soma(int n) {
        int soma = 0;
        for(int index = 1; index <= n; index++) {
            soma += index;
        }

        System.out.println(soma);
    }

    public static void fatorial(int n) {
        int nFatorial = 1;

        int index = 1;
        while (index <= n) {
            nFatorial *= index;
            index++;
        }

        System.out.println(nFatorial);
    }

    public static void contaDigitos(int n) {
        String nString = String.valueOf(Math.abs(n));
        int nDigitos = nString.length();

        System.out.println(nDigitos);
    }

    public static void inverterDigitos(int n) {
        int nInvertido = 0;

        while (n > 0) {
            nInvertido = nInvertido * 10 + n % 10;
            n /= 10;
        }
        System.out.println(nInvertido);

    }

    public static void potencia(int b, int exp) {
        int resultadoPotencia = 1;

        for(int index = 1; index <= exp; index++) {
            resultadoPotencia *= b;
        }
        System.out.println(resultadoPotencia);
    }

    public static void palindromo(int n) {
        String nEmString = String.valueOf(n);
        String nInvertido = new StringBuilder(nEmString).reverse().toString();

        if (nEmString.equals(nInvertido)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void converterParaDecimal(int n) {
        int exp = 0;
        int nDecimal = 0;

        for(int index = n; index >= 0; index--){
            nDecimal += (int) ((n % 10) * Math.pow(2,exp));
            n /= 10;
            exp++;
        }
        System.out.println(nDecimal);
    }

    public static void multiplos(int n, int l) {

        for(int index = n; index <= l; index++) {
            if (index % n == 0) {
                System.out.print("[" + index + "] ");
            }
        }
    }
}