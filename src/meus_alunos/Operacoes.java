package meus_alunos;

import java.util.ArrayList;

public class Operacoes {

    public void pesquisarAluno(ArrayList<Aluno> lista, int numero) {
        boolean achou = false;
        for (Aluno aluno : lista) {
            if (aluno.numero == numero) {
                System.out.println("Aluno encontrado:");
                aluno.imprimir();
                achou = true;
                break;
            }
        }
        if (!achou) {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void imprimirTodos(ArrayList<Aluno> lista) {
        if (lista.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de alunos:");
            for (Aluno aluno : lista) {
                aluno.imprimir();
            }
        }
    }
}
