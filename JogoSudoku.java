import java.util.Scanner;

public class JogoSudoku {
    private static final int TAMANHO = 9;
    private static int[][] tabuleiro = new int[TAMANHO][TAMANHO];

    public static void main(String[] args) {
        inicializarTabuleiro();
        jogarSudoku();
    }

    public static void inicializarTabuleiro() {
        // Inicializa o tabuleiro com os valores iniciais do Sudoku
        tabuleiro = new int[][] {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
    }

    public static void jogarSudoku() {
        Scanner scanner = new Scanner(System.in);
        while (!jogoTerminado()) {
            imprimirTabuleiro();

            System.out.print("Digite a linha (1-9): ");
            int linha = scanner.nextInt() - 1;

            System.out.print("Digite a coluna (1-9): ");
            int coluna = scanner.nextInt() - 1;

            System.out.print("Digite o valor (1-9): ");
            int valor = scanner.nextInt();

            if (movimentoValido(linha, coluna, valor)) {
                tabuleiro[linha][coluna] = valor;
                System.out.println("Movimento válido! Continue jogando.");
            } else {
                System.out.println("Movimento inválido. Tente novamente.");
            }
        }

        imprimirTabuleiro();
        System.out.println("Parabéns! Você completou o Sudoku!");
    }

    public static boolean jogoTerminado() {
        // Verifica se todas as células estão preenchidas
        for (int linha = 0; linha < TAMANHO; linha++) {
            for (int coluna = 0; coluna < TAMANHO; coluna++) {
                if (tabuleiro[linha][coluna] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean movimentoValido(int linha, int coluna, int valor) {
        // Verifica se o movimento é válido 
        if (valor < 1 || valor > 9 || tabuleiro[linha][coluna] != 0) {
            return false;
        }

        // Verifica a linha e a coluna
        for (int i = 0; i < TAMANHO; i++) {
            if (tabuleiro[linha][i] == valor || tabuleiro[i][coluna] == valor) {
                return false;
            }
        }

        // Verifica o bloco 3x3
        int iniciaLinha = linha - linha % 3;
        int iniciaColuna = coluna - coluna % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[iniciaLinha + i][iniciaColuna + j] == valor) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void imprimirTabuleiro() {
        System.out.println("-------------------------");
        for (int linha = 0; linha < TAMANHO; linha++) {
            for (int coluna = 0; coluna < TAMANHO; coluna++) {
                System.out.print(tabuleiro[linha][coluna] + " ");
                if ((coluna + 1) % 3 == 0) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if ((linha + 1) % 3 == 0) {
                System.out.println("-------------------------");
            }
        }
    }
}
