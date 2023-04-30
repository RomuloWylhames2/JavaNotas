package javaExecutavel;

import javax.swing.JOptionPane;

import classes.Aluno;

public class App {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Qual o nome do Aluno ?");
        String idade = JOptionPane.showInputDialog("Qual a idade ?");
        String dataNascimento = JOptionPane.showInputDialog("Data de nascimento ?");
        String registroGeral = JOptionPane.showInputDialog("Qual é o Registro Geral ?");
        String cpf = JOptionPane.showInputDialog("Qual é o CPF ?");
        String NomeMae = JOptionPane.showInputDialog("Qual é o nome da Mãe ?");
        String NomePai = JOptionPane.showInputDialog("Qual é o nome do Pai ?");
        String DataMatricula = JOptionPane.showInputDialog("Qual é a Data da Matricula ?");
        String serie = JOptionPane.showInputDialog("Qual a série ?");
        String escola = JOptionPane.showInputDialog("Qual é a Escola ?");
        String nota1 = JOptionPane.showInputDialog("Qual é a nota 1 ?");
        String nota2 = JOptionPane.showInputDialog("Qual é a nota 2 ?");
        String nota3 = JOptionPane.showInputDialog("Qual é a nota 3 ?");
        String nota4 = JOptionPane.showInputDialog("Qual é a nota 4 ?");

        Aluno aluno1 = new Aluno();

        aluno1.setNome(nome);
        aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(registroGeral);
        aluno1.setNumeroCPF(cpf);
        aluno1.setNomeMae(NomeMae);
        aluno1.setNomePai(NomePai);
        aluno1.setDataMatricula(DataMatricula);
        aluno1.setSerieMatriculado(serie);
        aluno1.setNomeEscola(escola);
        aluno1.setNota1(Double.parseDouble(nota1));
        aluno1.setNota2(Double.parseDouble(nota2));
        aluno1.setNota3(Double.parseDouble(nota3));
        aluno1.setNota4(Double.parseDouble(nota4));

        System.out.println("Nome é = " + aluno1.getNome());
        System.out.println("Idade é " + aluno1.getIdade());
        System.out.println("Data de Nascimento = " + aluno1.getDataNascimento());
        System.out.println("Média da nota é = " + aluno1.getMediaNota());
        System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));

    }
}
