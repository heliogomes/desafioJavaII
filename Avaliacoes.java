package Aula04MédiaAlunos;
import java.util.Scanner;

public class Avaliacoes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira as informações a seguir do aluno para saber sua média! ");

        ControladorDadosAlunos DadosAlunos = new ControladorDadosAlunos();
        Aluno aluno = DadosAlunos.cadastrarAluno();
        float media = DadosAlunos.gerarMediaAluno(aluno.getNota1(), aluno.getNota2());

        System.out.println("Sua média é: " + media);

        if(media>0 && media<=4.9){
            System.out.println("Aluno em recuperação.");
            System.out.println("O aluno precisará tirar a nota " + ((10-media)+2) + " para passar.");
        }else if(media>=5 && media<=6.9){
            System.out.println("Aluno em prova final");
            System.out.print("O aluno precisará tirar a nota " + (10-media) + " para passar.");
        }else if(media>=7 && media<=10){
            System.out.println("Aluno aprovado por média.");
        }
    }
}