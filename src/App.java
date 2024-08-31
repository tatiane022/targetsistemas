import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // **** QUESTÃO 1 ****
        System.out.println("**** QUESTÃO 1 ****");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");

        long numero = scanner.nextLong();
        String mensagem = existeEmFibonacci(numero);
        System.out.println(mensagem);
        System.out.println();

        // **** QUESTÃO 2 ****
        System.out.println("**** QUESTÃO 2 ****");
        scanner.nextLine();
        System.out.print("Digite uma string: ");

        String entrada = scanner.nextLine();

        int cont = 0;

        // Verifica se existe e conta a quantidade de 'a' ou 'A'
        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (c == 'a' || c == 'A') {
                cont++;
            }
        }

        if (cont > 0) {
            System.out.println("A letra 'a' aparece " + cont + " vezes");
        } else {
            System.out.println("A letra 'a' não foi identificada na string informada");
        }
        System.out.println();

        scanner.close();

        // **** QUESTÃO 3 ****
        System.out.println("**** QUESTÃO 3 ****");
        // O RESULTADO CORRETO É 77

        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println("O RESULTADO É: " + SOMA);
        System.out.println();

        // **** QUESTÃO 4 ****
        // 4) Descubra a lógica e complete o próximo elemento:
        // a) 1, 3, 5, 7, 9
        // b) 2, 4, 8, 16, 32, 64, 128
        // c) 0, 1, 4, 9, 16, 25, 36, 49
        // d) 4, 16, 36, 64, 100
        // e) 1, 1, 2, 3, 5, 8, 13
        // f) 2,10, 12, 16, 17, 18, 19, 20
        System.out.println("**** QUESTÃO 4 ****\n" +
                "4) Descubra a lógica e complete o próximo elemento:\n" +
                "a) 1, 3, 5, 7, 9\n" +
                "b) 2, 4, 8, 16, 32, 64, 128\n" +
                "c) 0, 1, 4, 9, 16, 25, 36, 49\n" +
                "d) 4, 16, 36, 64, 100\n" +
                "e) 1, 1, 2, 3, 5, 8, 13\n" +
                "f) 2, 10, 12, 16, 17, 18, 19, 20");
        System.out.println();

        // **** QUESTÃO 5 ****
        // Para identificar qual interruptor controla cada lâmpada:");
        // 1- Ligue o primeiro interruptor e deixe-o ligado por alguns minutos
        // 2- Desligue o primeiro interruptor e ligue o segundo interruptor
        // 3- Vá até as salas das lâmpadas:
        // - A lâmpada que está acesa e quente é controlada pelo primeiro interruptor
        // - A lâmpada que está acesa e fria é controlada pelo segundo interruptor
        // A lâmpada que está apagada e fria é controlada pelo terceiro interruptor
        System.out.println("**** QUESTÃO 5 ****\n" +
                "Para identificar qual interruptor controla cada lâmpada:\n" +
                "1- Ligue o primeiro interruptor e deixe-o ligado por alguns minutos.\n" +
                "2- Desligue o primeiro interruptor e ligue o segundo interruptor.\n" +
                "3- Vá até as salas das lâmpadas:\n" +
                "   - A lâmpada que está acesa e quente é controlada pelo primeiro interruptor.\n" +
                "   - A lâmpada que está acesa e fria é controlada pelo segundo interruptor.\n" +
                "   - A lâmpada que está apagada e fria é controlada pelo terceiro interruptor.");

    }

    // Método para verificar se o número pertence à sequência de Fibonacci
    public static String existeEmFibonacci(long numero) {
        boolean resultado = calcularFibonacci(numero);
        if (resultado == true) {
            return "O número " + numero + " pertence à sequência de Fibonacci.";
        } else {
            return "O numero " + numero + " NÃO pertence a sequência de Fibonacci.";
        }
    }

    // Metodo que ira calcular se o numero informado pertence a sequencia de
    // Fibonacci
    public static boolean calcularFibonacci(long numero) {

        // para verificarmos se o numero é negativo pois não existe numero negativo na
        // sequencia de Fibonacci
        if (numero < 0) {
            return false;
        }

        long fib1 = 0;
        long fib2 = 1;

        // Para otimizar a busca se o numero é 0 ou 1 ja sabemos que ele pertence a
        // sequencia
        if (numero == fib1 || numero == fib2) {
            return true;
        }

        long proximoFib = fib1 + fib2;

        // Loop dentro da sequencia de Fibonacci que busca sde o numero fornecido é
        // maior ou igual ao numero que foi informado
        while (proximoFib <= numero) {
            if (proximoFib == numero) {
                return true;
            }
            fib1 = fib2;
            fib2 = proximoFib;
            proximoFib = fib1 + fib2;
        }
        return false;
    }
}