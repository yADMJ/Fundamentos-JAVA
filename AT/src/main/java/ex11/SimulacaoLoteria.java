package ex11;
import java.util.*;


public class SimulacaoLoteria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Set<Integer> numerosSorteados = new HashSet<>();
        while (numerosSorteados.size() < 6) {
            int numero = random.nextInt(60) + 1; // Números entre 1 e 60
            numerosSorteados.add(numero);
        }

        System.out.println("Números sorteados: " + numerosSorteados);

        Set<Integer> numerosUsuario = new HashSet<>();
        System.out.println("Digite 6 números entre 1 e 60 (sem repetir):");
        while (numerosUsuario.size() < 6) {
            int numero = scanner.nextInt();
            if (numero >= 1 && numero <= 60) {
                if (numerosUsuario.contains(numero)) {
                    System.out.println("Número já inserido, escolha outro.");
                } else {
                    numerosUsuario.add(numero);
                }
            } else {
                System.out.println("Número inválido! Digite um número entre 1 e 60.");
            }
        }

        Set<Integer> acertos = new HashSet<>(numerosUsuario);
        acertos.retainAll(numerosSorteados);

        System.out.println("Você acertou " + acertos.size() + " números.");
        System.out.println("Números sorteados: " + numerosSorteados);
        System.out.println("Seus acertos: " + acertos);
    }
}
