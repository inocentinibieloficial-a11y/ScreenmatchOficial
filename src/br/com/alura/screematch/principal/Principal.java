import br.com.alura.calculos.CalculadoraDeTempo;
import br.com.alura.calculos.FiltroRecomendacao;
import br.com.alura.screenmatchoficial.modelos.Episodio;
import br.com.alura.screenmatchoficial.modelos.Filme;
import br.com.alura.screenmatchoficial.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Batman", 2022);
        //meuFilme.setNome("Batman");
        //meuFilme.setAnoDeLancamento(2022);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duraçao do Filme: "+ meuFilme.getDuracaoEmMinutos());


        meuFilme.exibrFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        System.out.println("Total De Avaliacao : "+ meuFilme.getTotalAvaliacao());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.totalAvaliacao = 1;
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.setDuracaoEmMinutos(120);
        lost.exibrFichaTecnica();
        lost.setTemporada(5);
        lost.setEpisodioPorTemporada(12);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duraçao do Filme: "+ lost.getDuracaoEmMinutos());


        Filme nextFilm = new Filme("Pacman" , 2020);
        //nextFilm.setNome("Pacman");
       // nextFilm.setAnoDeLancamento(2020);
        nextFilm.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(nextFilm) ;
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro =  new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacao(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogvilla", 2003);
        //filmeDoPaulo.setNome("Dogvilla");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        //filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(meuFilme);
        listaFilmes.add(nextFilm);
        listaFilmes.add(filmeDoPaulo);
        System.out.println("Tamanho da lista " + listaFilmes.size());
        System.out.println("Primeiro Filme " + listaFilmes.get(0).getNome());
        System.out.println(listaFilmes);
        System.out.println("toString Filme " + listaFilmes.get(0).toString());



    }
}
