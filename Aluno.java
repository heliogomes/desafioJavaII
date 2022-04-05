package Aula04MédiaAlunos;

public class Aluno {
        public String nome;
        public String curso;
        public int periodo;
        public float nota1;
        public float nota2;
        public float media;

        Aluno(String nome, String curso, int periodo, float nota1, float nota2, float media){
                this.nome = nome;
                this.curso = curso;
                this.periodo = periodo;
                this.nota1 = nota1;
                this.nota2 = nota2;
                this.media= media;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

        public int getPeriodo() {
            return periodo;
        }

        public void setPeriodo(int periodo) {
            this.periodo = periodo;
        }

        public float getNota1() {
            return nota1;
        }

        public void setNota1(float nota1) {
            this.nota1 = nota1;
        }

        public float getNota2() {
            return nota2;
        }

        public void setNota2(float nota2) {
            this.nota2 = nota2;
        }

        public float getMedia() {
            return media;
        }

        public void setMedia(float media) {
            this.media = media;
        }

}


