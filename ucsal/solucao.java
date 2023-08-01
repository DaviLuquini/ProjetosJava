package ucsal;

public class solucao {

public static int[] obterArray05(int tam, int ini) {
    int[] vetor = new int[tam];
    int valor = ini;

    for (int i = 0; i < tam; i++) {
        while (valor % 2 != 0 || valor % 3 != 0 || valor % 5 != 0) {
            valor++;
        }
        vetor[i] = valor;
        valor++;
    }
    return vetor;
  }

  public static int[][] obterArray06(int x, int y) {
    int[][] arrayFibonacci = new int[x][y];
    
    int valorAnterior = 0;
    int valorAtual = 1;
    
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
            arrayFibonacci[i][j] = valorAnterior;
            
            int proximoValor = valorAnterior + valorAtual;
            valorAnterior = valorAtual;
            valorAtual = proximoValor;
        }
    }
    
    return arrayFibonacci;
  }
  public static int[][] obterArray07(int li, int co, int n) {
    int[][] arraySequencia = new int[li][co];

    for (int i = 0; i < li; i++) {
        for (int j = 0; j < co; j++) {
            if (j == 0) {
                arraySequencia[i][j] = n;
                n++;
            } else if (j % 2 == 0) {
                arraySequencia[i][j] = arraySequencia[i][j - 2] + 1;
            } else {
                arraySequencia[i][j] = arraySequencia[i][j - 1] * arraySequencia[i][j - 1];
            }
        }
    }

    return arraySequencia;
  }
  public static int[] obterArray08(int[][] a) {
    int elementosTotais = a.length * a[0].length;
    int[] vetor = new int[elementosTotais];
    int index = 0;

    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[0].length; j++) {
            vetor[index] = a[i][j];
            index++;
        }
    }

    return vetor;
  }




}

