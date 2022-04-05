package Aula04MédiaAlunos;

import java.util.Scanner;

public class ControladorDadosAlunos {
    public float gerarMediaAluno(float nota1, float nota2){
       return (nota1 + nota2) / 2;
    }

    public Aluno cadastrarAluno(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome completo:");
        String nome = sc.nextLine();
        System.out.println("Digite o nome curso:");
        String curso = sc.nextLine();
        System.out.println("Digite o número do período:");
        int periodo = sc.nextInt();
        System.out.println("Digite a primeira nota:");
        float nota1 = sc.nextFloat();
        System.out.println("Digite a segunda nota:");
        float nota2 = sc.nextFloat();

        Aluno aluno = new Aluno(nome, curso, periodo, nota1, nota2, gerarMediaAluno(nota1,nota2));
        return aluno;
    }
}
