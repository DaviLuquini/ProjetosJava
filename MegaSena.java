import java.util.Random;
import java.util.Scanner;

public class MegaSena {

  public static void main(String[] args) {
    int[] numerosApostados = jogarMegaSena();
    int[] numerosSorteados = rodarRoleta();
    impressao(numerosApostados, numerosSorteados);
    validarNumeros(numerosApostados, numerosSorteados);
  }

  public static int[] jogarMegaSena() {
    int[] numerosApostados = new int[6];
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite os 6 números de 1 a 60 que você deseja apostar:");

    for (int i = 0; i < 6; i++) {
      System.out.print("Número " + (i + 1) + ": ");
      int numero = sc.nextInt();

      if (numero < 1 || numero > 60) {
        System.out.println("Número fora do intervalo permitido (1 a 60). Tente novamente.");
        i--;
      } else {
        numerosApostados[i] = numero;
      }
    }
    return numerosApostados;
  }

  public static int[] rodarRoleta() {
    Random random = new Random();
    int[] numerosSorteados = new int[6];
    int min = 1;
    int max = 60;
    int numeroSorteado;

    for (int i = 0; i < 6; i++) {
      numeroSorteado = random.nextInt(max - min + 1) + min;
      numerosSorteados[i] = numeroSorteado;
    }
    return numerosSorteados;
  }

  public static void impressao(int[] numerosApostados, int[] numerosSorteados) {

    System.out.print("Números apostados: ");
    for (int i = 0; i < numerosApostados.length; i++) {
      System.out.print(numerosApostados[i] + " ");
    }

    System.out.print("\n");
    System.out.print("Números sorteados: ");
    for (int i = 0; i < numerosSorteados.length; i++) {
      System.out.print(numerosSorteados[i] + " ");
    }
  }

  public static void validarNumeros(int[] numerosApostados, int[] numerosSorteados) {
    int acerto = 0;
    for (int i = 0; i < 6; i++) {
      if (numerosApostados[i] == numerosSorteados[i]) {
        acerto++;
      }
    }
    System.out.println("\n");
    if (acerto == 4) {
      System.out.println("Parabéns, você acertou 4 números e ganhou 500 mil reais");
    } else if (acerto == 5) {
      System.out.println("Parabéns, você acertou 5 números e ganhou 5 milhões de reais");
    } else if (acerto == 6) {
      System.out.println("Parabéns, você acertou 5 números e ganhou 200 milhões de reais");
    } else {
      System.out.println("Você não acertou nenhum número.");
    }
  }

}
