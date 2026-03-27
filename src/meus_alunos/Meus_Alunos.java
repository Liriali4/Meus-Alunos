package meus_alunos;

import java.util.ArrayList;
import java.util.Scanner;

class Aluno {
    int numero;
    String nome;
    int idade;
    String turma;

    public Aluno(int numero, String nome, int idade, String turma) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.turma = turma;
    }

    public void imprimir() {
        System.out.println("\n\nNúmero: " + numero + ",\n Nome: " + nome + ", \nIdade: " + idade + ", \nTurma: " + turma);
    }
}

public class Meus_Alunos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Aluno> lista = new ArrayList<>();
        Operacoes operacoes = new Operacoes();

        int opcao;
        do {
            System.out.println("\n1 - Cadastrar aluno");
            System.out.println("2 - Pesquisar aluno por número");
            System.out.println("3 - Imprimir todos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = input.nextLine();
                    System.out.print("Idade: ");
                    int idade = input.nextInt();
                    input.nextLine();
                    System.out.print("Turma: ");
                    String turma = input.nextLine();
                    System.out.print("Número: ");
                    int numero = input.nextInt();
                    lista.add(new Aluno(numero, nome, idade, turma));
                    System.out.println("Aluno cadastrado.");
                    break;

                case 2:
                    System.out.print("Número do aluno a pesquisar: ");
                    int numeroBusca = input.nextInt();
                    input.nextLine();
                    operacoes.pesquisarAluno(lista, numeroBusca);
                    break;

                case 3:
                    operacoes.imprimirTodos(lista);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 0);

        input.close();
    }
}
