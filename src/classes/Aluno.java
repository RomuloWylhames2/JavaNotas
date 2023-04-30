package classes;

public class Aluno {
    public String nome;
    int idade;
    String dataNascimento;
    String registroGeral;
    String numeroCpf;
    String nomeMae;
    String nomePai;
    String dataMatricula;
    String nomeEscola;
    String serieMatriculado;
    double nota1;
    double nota2;
    double nota3;
    double nota4;

    public Aluno() {

    }

    public Aluno(String nomePadrao) {
        nome = nomePadrao;
    }

    public Aluno(String nomePadrao, int indadePadrao) {
        nome = nomePadrao;
        idade = indadePadrao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.dataNascimento = DataNascimento;
    }

    public String getRegitroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String RegistroGeral) {
        this.registroGeral = RegistroGeral;
    }

    public String getCPF() {
        return numeroCpf;
    }

    public void setNumeroCPF(String NumeroCPF) {
        this.numeroCpf = NumeroCPF;
    }

    public String getMae() {
        return nomeMae;
    }

    public void setNomeMae(String NomeMae) {
        this.nomeMae = NomeMae;
    }

    public String gePai() {
        return nomePai;
    }

    public void setNomePai(String NomePai) {
        this.nomePai = NomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getMediaNota() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public boolean getAlunoAprovado() {
        double media = this.getMediaNota();
        if (media >= 70) {
            return true;
        } else {
            return false;
        }
    }

}
