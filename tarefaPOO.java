import java.util.Scanner;

public class tarefaPOO {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Pessoa pessoa1 = new Pessoa();
    Pessoa pessoa2 = new Pessoa();
    Pessoa pessoa3 = new Pessoa();
    Pessoa pessoa4 = new Pessoa();
    Pessoa pessoa5 = new Pessoa();

    Pessoa[] pessoas = { pessoa1, pessoa2, pessoa3, pessoa4, pessoa5 };

    pessoa1.nome = "davi";
    pessoa1.idade = 18;

    pessoa2.nome = "gisele";
    pessoa2.idade = 17;

    pessoa3.nome = "jacob";
    pessoa3.idade = 22;

    pessoa4.nome = "matias";
    pessoa4.idade = 36;

    pessoa5.nome = "patricia";
    pessoa5.idade = 25;

    for (int i = 0; i < pessoas.length; i++) {
      System.out.println(pessoas[i].nome);
      System.out.println(pessoas[i].idade);
    }

    boolean nomeNaLista = false;

    System.out.println("Digite o seu nome:");
    String nome = sc.next();
    for (int i = 0; i < pessoas.length; i++) {
      if (nome.equalsIgnoreCase(pessoas[i].nome)) {
        nomeNaLista = true;
      }
    }
    if (nomeNaLista == true) {
      System.out.println("Seu nome está na lista");
    } else {
      System.out.println("Seu nome não está na lista");
    }
    sc.close();
  }
}
