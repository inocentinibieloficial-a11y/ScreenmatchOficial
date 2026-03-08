package br.com.alura.screenmatchoficial.modelos;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private  int totalAvaliacao;
    private int duracaoEmMinutos;


    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setTotalAvaliacao(int totalAvaliacao) {
        this.totalAvaliacao = totalAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {

        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {

        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {

        return duracaoEmMinutos;
    }

    public void exibrFichaTecnica(){
        System.out.println("Nome desse filme: " + nome);
        System.out.println("Ano do lançamento : " + anoDeLancamento);
        System.out.println("DuraçÄo do filme  : " + duracaoEmMinutos);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacao++;

    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacao;
    }


    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}

