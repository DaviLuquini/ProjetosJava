package Laboratorio3;

import java.util.Scanner;

public class alunos {
  private int id;
  private int matricula;
  private String nome;

  public alunos(int id, int matricula, String nome) {
    this.id = id;
    this.matricula = matricula;
    this.nome = nome;
  }

  public static void main(String[] args) {
    int x = 0;
    Scanner sc = new Scanner(System.in);
    alunos[] aluno = new alunos[20];
    boolean continuar = true;

    while (x < 20 && continuar) {
      System.out.println("Deseja adicionar um aluno? (sim/nao)");
      String resposta = sc.nextLine();
      if (resposta.equalsIgnoreCase("sim")) {
        System.out.println("Preencha suas informações:");
        System.out.print("Seu ID: ");
        int id = sc.nextInt();
        System.out.print("Sua Matricula: ");
        int matricula = sc.nextInt();
        sc.nextLine();
        System.out.print("Seu nome: ");
        String nome = sc.nextLine();

        aluno[x] = new alunos(id, matricula, nome);

        x++;
      } else {
        continuar = false;
      }
    }
    for (int i = 0; i < 20 && i < x; i++) {
      System.out.println("Aluno " + (i + 1) + ":");
      System.out.println("ID: " + aluno[i].id);
      System.out.println("Matricula: " + aluno[i].matricula);
      System.out.println("Nome: " + aluno[i].nome);
    }
    sc.close();
  }
}
