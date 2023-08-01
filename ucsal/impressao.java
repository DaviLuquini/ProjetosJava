package ucsal;

public class impressao {
  public static void imprimir01(int[] vetor) {
    for (int i = 0; i < vetor.length; i++) {
      System.out.println(vetor[i] + " ");
    }
    System.out.println(); 
  }

  public static void imprimir02(int[][] vetor) {
    for (int i = 0; i < vetor.length; i++) {
        for (int j = 0; j < vetor[i].length; j++) {
            System.out.print(vetor[i][j] + " ");
        }
        System.out.println();
    }
}

}
