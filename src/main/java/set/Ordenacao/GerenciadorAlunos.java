package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    private void adicionarAluno(String nome, int matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    private void removerAluno(long matricula){
        boolean flag = false;
        for (Aluno a: alunoSet){
            if(a.getMatricula() == matricula){
                alunoSet.remove(a);
                System.out.println("Aluno com a matrícula " + matricula + " removido.");
                flag=true;
                break;
            }
        }
        if (!flag){
            System.out.println("Matrícula nao localizada.");
        }
    }

    private Set<Aluno> exibirAlunos(){
        return alunoSet;
    }

    private Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        return alunoPorNome;
    }

    private Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        alunoPorNota.addAll(alunoSet);
        return alunoPorNota;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Wallace", 1721, 8.5);
        gerenciadorAlunos.adicionarAluno("Carlos", 1854, 9);
        gerenciadorAlunos.adicionarAluno("Edu", 8451, 7.5);
        gerenciadorAlunos.adicionarAluno("Dani", 1254, 7.8);

        System.out.println(gerenciadorAlunos.exibirAlunos());

        gerenciadorAlunos.removerAluno(4444);
        gerenciadorAlunos.removerAluno(8451);

        System.out.println(gerenciadorAlunos.exibirAlunos());

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());


    }

}
