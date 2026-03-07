public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private  int totalAvaliacao;
    int duracaoEmMinutos;

    public int getTotalAvaliacao(){
        return totalAvaliacao;
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


}
