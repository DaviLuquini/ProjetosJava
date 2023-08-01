package ucsal;

import java.util.Scanner;

public class executor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //problema 05
    System.out.println("Problema 05:\n");
    System.out.print("Digite o tamanho do array: ");
    int tamanho = sc.nextInt();

    System.out.print("Digite o valor inicial: ");
    int valorInicial = sc.nextInt();

    int[] arrayResultado05 = solucao.obterArray05(tamanho, valorInicial);
    impressao.imprimir01(arrayResultado05);
    //problema 06
    System.out.println("Problema 06:\n");
    System.out.print("Digite o numero de linhas do array: ");
    int linhas = sc.nextInt();

    System.out.print("Digite o numero de colunas do array: ");
    int colunas = sc.nextInt();

    int[][] arrayResultado06 = solucao.obterArray06(linhas, colunas);
    impressao.imprimir02(arrayResultado06);
    //problema 07
    System.out.println("Problema 07:\n");
    System.out.print("Digite o numero de linhas do array: ");
    int linhas02 = sc.nextInt();

    System.out.print("Digite o numero de colunas do array: ");
    int colunas02 = sc.nextInt();

    System.out.print("Digite um numero inicial para o array: ");
    int valorInicial02 = sc.nextInt();

    int[][] arrayResultado07 = solucao.obterArray07(linhas02, colunas02, valorInicial02);
    impressao.imprimir02(arrayResultado07);
    //problema 08
    System.out.println("Problema 08:\n");
    System.out.print("Digite o numero de linhas do array: ");
    int linhas03 = sc.nextInt();

    System.out.print("Digite o numero de colunas do array: ");
    int colunas03 = sc.nextInt();

    int[][] array = new int[linhas03][colunas03];

    System.out.println("Digite os elementos do array:");
    for (int i = 0; i < linhas; i++) {
        for (int j = 0; j < colunas; j++) {
            array[i][j] = sc.nextInt();
        }
    }

    int[] arrayResultado08 = solucao.obterArray08(array);
    impressao.imprimir01(arrayResultado08);

    sc.close();
  }
  
}
